package com.hxw.input;

import android.support.annotation.NonNull;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;


/**
 * 过滤不在范围内的字符
 *
 * @author hxw
 * @date 2017/12/8
 */

public class InputViewFilter implements InputFilter {

    /**
     * 字符的范围
     */
    private char[] mAccepted;

    public InputViewFilter(@NonNull String accepted) {
        mAccepted = new char[accepted.length()];
        accepted.getChars(0, accepted.length(), mAccepted, 0);
    }

    /**
     * 过滤操作
     *
     * @param source 变化的字符串
     * @param start  变化字符的首字符下标
     * @param end    变化字符的尾字符下
     * @param dest   带光标的字符串
     * @param dstart 光标的起始位置
     * @param dend   光标的结束位置
     * @return
     */
    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {

        SpannableStringBuilder filtered =
                new SpannableStringBuilder(source, start, end);
        //从后往前历遍对比，
        for (int j = end - 1; j >= start; j--) {
            if (!ok(mAccepted, source.charAt(j))) {
                filtered.delete(j, j + 1);
            }
        }
        return filtered;
    }

    /**
     * @param accept
     * @param c
     * @return true:符合  false:不符合
     */
    private static boolean ok(char[] accept, char c) {
        for (int i = accept.length - 1; i >= 0; i--) {
            if (accept[i] == c) {
                return true;
            }
        }
        return false;
    }
}
