package com.example.mdc_android3sample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.widget.Button
import com.example.mdc_android3sample.button.ButtonActivity
import com.example.mdc_android3sample.buttonNavigation.ButtonNavigationActivity
import com.example.mdc_android3sample.textfield.TextFieldActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener { startActivity(Intent(this,ButtonActivity::class.java)) }
        findViewById<Button>(R.id.textField).setOnClickListener { startActivity(Intent(this,TextFieldActivity::class.java)) }
        findViewById<Button>(R.id.buttonNavigation).setOnClickListener { startActivity(Intent(this,ButtonNavigationActivity::class.java)) }
        Log.d("filesDir",filesDir.toString());
        Log.d("cacheDir",cacheDir.toString());
        Log.d("getExternalFilesDir",getExternalFilesDir(Environment.DIRECTORY_DCIM).toString());
        Log.d("getExternalFilesDir",getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS).toString());
        Log.d("getExternalFilesDir",getExternalFilesDir("").toString());

        var files: Array<String> = fileList()

        requestPermissions(arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE,android.Manifest.permission.READ_EXTERNAL_STORAGE),11)

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode===11){
            for (grant in grantResults){

            }
        }
    }
}