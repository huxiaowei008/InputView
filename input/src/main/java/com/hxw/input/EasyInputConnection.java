package com.hxw.input;

import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;

/**
 * @author hxw
 * InputConnection接口是接收输入的应用程序与InputMethod间的通讯通道。
 * 它可以完成以下功能,如读取光标周围的文本,向文本框提交文本,向应用程序提交原始按键事件。
 */

public class EasyInputConnection extends BaseInputConnection {

    private InputView mInputView;

    EasyInputConnection(InputView inputView) {
        super(inputView, true);
        this.mInputView = inputView;
    }

    /**
     * 文本输入
     */
    @Override
    public boolean commitText(CharSequence text, int newCursorPosition) {
        mInputView.sendOnTextChanged(text, true);
        return super.commitText(text, newCursorPosition);
    }

    /**
     * 按键输入
     */
    @Override
    public boolean sendKeyEvent(KeyEvent event) {
        //只监听按键抬起来的动作
        if (event.getAction() == KeyEvent.ACTION_UP) {
            //删除按键按下
            if (event.getKeyCode() == KeyEvent.KEYCODE_DEL) {
                mInputView.sendOnTextChanged("", false);
            }
        }
        return super.sendKeyEvent(event);
    }

    /**
     * 这个方法基本上会出现在切换输入法类型，点击回车（完成、搜索、发送、下一步）点击输入法右上角隐藏按钮会触发。
     */
    @Override
    public boolean finishComposingText() {
        return super.finishComposingText();
    }
}
