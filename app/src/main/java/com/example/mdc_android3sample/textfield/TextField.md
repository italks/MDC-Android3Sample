# TextField
> 输入，编辑文字

## 一、使用TextField

开始之前，先要按照[Button组件](../button/Button.md)内的第一二步，引入Material Design 3库，然后设置Material Design 3的主题。

```
implementation 'com.google.android.material:material:1.9.0'
```

style.xml设置主题

```
<style name="Theme.MyApp" parent="Theme.Material3.DayNight.NoActionBar">
    <!-- ... -->
</style>
```
输入框有TextInputLayout和被包含的TextInputEditText组成的，EditText也可以，但是需要设置background为@null，这样TextInputLayout就可以设置EditText的背景了。
