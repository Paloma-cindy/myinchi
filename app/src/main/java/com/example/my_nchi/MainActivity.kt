package com.example.my_nchi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClicked(view: View){
        if(kenyacheckbox.isChecked)textresult.text="Kenya: Yes we speak English as our first language"
        if (Ugandacheckbox.isChecked)textresult.text="Uganda: Yes We do Speak"
        if (TanzaniacheckBox.isChecked)textresult.text="Tanzania: Yes but we prefer Swahili"
    }
}