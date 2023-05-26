# Button组件

[toc]

参考链接：
1. [使用入门](https://github.com/material-components/material-components-android/blob/master/docs/getting-started.md)
2. [Button组件库](https://github.com/material-components/material-components-android/blob/master/docs/components/Button.md)

## 一、添加MDC-Android库

新建空白项目，在app模块的build.gradle中添加当前最新的版本，可以通过Google's Maven Repository或者MVN Repository库查看当前最新版本。

[Google's Maven Repository：](https://maven.google.com/web/index.html#com.google.android.material:material)


[MVN Repository：](https://mvnrepository.com/artifact/com.google.android.material/material)
```groovy
implementation 'com.google.android.material:material:<version>'
```

## 二、Material 3主题

```xml
<style name="Theme.MyApp" parent="Theme.Material3.DayNight.NoActionBar">
    <!-- ... -->
</style>
```

## 三、7种类型的按钮

1. Elevated button
2. Filled button
3. Filled tonal button
4. Outlined button：边框按钮
5. Text button：文字按钮
6. Toggle button：切换按钮
7. Icon button：图标按钮


## 四、样式属性
### 文字属性
| 元素        | 属性         | 方法       | 默认值 |
|:-----------|:-------------|:----------|:------|
|文字标签 | `android:text` | `setText`,`getText` |   `null`    |
|颜色|`android:textColor`|`setTextColor`|`?attr/colorOnSurface`|
|排榜|`android:textAppearance`|`setTextAppearance`|`?attr/textAppearanceLabelLarge`|
### 容器属性
| 元素        | 属性         | 方法       | 默认值 |
|:-----------|:-------------|:----------|:------|
|提示颜色|`app:backgroundTint`|`setBackgroundColor`,`setBackgroundTintList`,`getBackgroundTintList`|`?attr/colorSurface`|
|边框颜色|`app:strokeColor`|`setStrokeColor`,`setStrokeColorResource`,`getStrokeColor`|`null`|
|边框宽度|`app:strokeWidth`|`setStrokeWidth`,`setStrokeWidthResource`,`getStrokeWidth	`|`0dp`|
|形状|`app:shapeAppearance`|`setShapeAppearanceModel`,`getShapeAppearanceModel`|`?attr/shapeAppearanceSmallComponent`|
|高度|`app:elevation`|`setElevation`,`getElevation`|`2dp`|
|波纹|`app:rippleColor`|`setRippleColor`,`setRippleColorResource`,`getRippleColor`|`?attr/colorOnPrimary`|

###  图标属性
| 元素        | 属性         | 方法       | 默认值 |
|:-----------|:-------------|:----------|:------|
|图标|`app:icon`|`setIcon`,`setIconResource`,`getIcon`|`null`|
|图标颜色|`app:iconTint`|`setIconTint`,`setIconTintResource`,`getIconTint`|`?attr/colorOnSurface`|
|图标大小|`app:iconSize`|`setIconSize`,`getIconSize`|`wrap_content`|
|图标位置|`app:iconGravity`|`setIconGravity`,`getIconGravity`|`start`|
|图标内边距|`app:iconPadding`|`setIconPadding`,`getIconPadding`|`8dp`|

###  样式
| 元素        | 属性         |
|:-----------|:-------------|
|1|`Widget.Material3.Button.ElevatedButton`|
|2|`Widget.Material3.Button`|
|3|`Widget.Material3.Button.TonalButton`|
|4|`Widget.Material3.Button.OutlinedButton`|
|5|`Widget.Material3.Button.TextButton`|
|6|`Widget.Material3.Button.IconButton`|