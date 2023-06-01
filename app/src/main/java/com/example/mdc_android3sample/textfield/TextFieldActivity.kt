package com.example.mdc_android3sample.textfield

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.mdc_android3sample.R
import com.google.android.material.textfield.MaterialAutoCompleteTextView
import com.google.android.material.textfield.TextInputLayout

class TextFieldActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_field)
        findViewById<TextInputLayout>(R.id.textField2).setEndIconOnClickListener {  }
        findViewById<TextInputLayout>(R.id.textField2).addOnEditTextAttachedListener  {  }
//        findViewById<TextInputLayout>(R.id.textField2).addOnEndIconChangedListener(){}

        //下拉框，AutoCompleteTextView
        val items = arrayOf("Item 1", "Item 2", "Item 3", "Item 4")
        (findViewById<TextInputLayout>(R.id.textField3).editText as? MaterialAutoCompleteTextView)?.setSimpleItems(items)

        val items2 = listOf("Item 1", "Item 2", "Item 3", "Item 4")
        val adapter = ArrayAdapter(this, R.layout.list_item, items)
        (findViewById<TextInputLayout>(R.id.textField4).editText as? AutoCompleteTextView)?.setAdapter(adapter)

        findViewById<TextInputLayout>(R.id.textField5).error = getString(R.string.error)
        //清除错误信息
//        findViewById<TextInputLayout>(R.id.textField5).error = null


    }
}



