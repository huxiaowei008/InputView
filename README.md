# InputView
[![bintray](https://api.bintray.com/packages/huxiaowei008/maven/InputView/images/download.svg) ](https://bintray.com/huxiaowei008/maven/InputView/_latestVersion)
[![License](http://img.shields.io/badge/License-Apache%202.0-blue.svg?style=flat-square) ](http://www.apache.org/licenses/LICENSE-2.0)

类似车牌或者密码输入框的输入控件，想看效果图？
>[点击此处](http://www.jianshu.com/p/6155cf8ae080)

##下载
```gradle
compile 'com.hxw.input:input:1.0.3'
```

##使用
在布局中
```xml
    <com.hxw.input.InputView
        android:id="@+id/input1"
        android:layout_width="0dp"
        android:layout_height="32dp"
        android:layout_marginEnd="8dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:background="#00ffffff"/>
```
一些属性

| Name | Description |
|:----:|:-----------:|
| textColor | 字体的颜色 |
| textBackground | 文字没有选中时的背景，可以用图片或者颜色，不设置的话背景会用画线模式|
| textBackgroundSelected | 文字被选中时的背景，可以用图片或者颜色，不设置的话背景会用画线模式 |
| maxLength | 最大字数 |
| boxMargin | 文字背景框的margin |
| isPassword | 是否是密码，是的话不会显示具体字符 |
| strokeWidth | 画线模式下线的宽度 |
| lineColor | 画线模式下线的颜色 |
| radius | 画线模式下四角的弧度 |
| input | 设置允许输入哪些字符，和textView的digits一样用法 |

##License
```
Copyright huxiaowei008

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```