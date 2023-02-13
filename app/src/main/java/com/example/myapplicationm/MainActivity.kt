package com.example.myapplicationm

import android.content.Context
import android.inputmethodservice.InputMethodService
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.CollapsibleActionView
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.myapplicationm.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding= DataBindingUtil.setContentView(this, R.layout.activity_main)



      //  findViewById<Button>(R.id.done_buttonnn).setOnClickListener {
        //    addNickName(it)
        //}
binding.doneButtonnn.setOnClickListener {
    addNickName(it)
}
    }

   private fun addNickName(view: View){
       //val edittText= findViewById<EditText>(R.id.nickname)
       //val nicknameTextiew = findViewById<TextView>(R.id.textView2)

       binding.textView2.text = binding.nickname.text
       binding.nickname.visibility=View.GONE
       binding.doneButtonnn.visibility=View.GONE
       binding.textView2.visibility=View.VISIBLE

       val imm= getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
       imm.hideSoftInputFromWindow(view.windowToken, 0)






   }



}