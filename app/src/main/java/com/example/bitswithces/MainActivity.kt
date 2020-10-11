package com.example.bitswithces

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number =0u
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text=number.toString()
        editTextNumber.doOnTextChanged { text, start, before, count ->
            changeEdittextcolor()
       }
        switch0.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
                bitDidSwitch(0,1)
            else
                bitDidSwitch(0,0)
        }
        switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
                bitDidSwitch(1,1)
            else
                bitDidSwitch(1,0)
        }
        switch2.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
                bitDidSwitch(2,1)
            else
                bitDidSwitch(2,0)
        }
        switch3.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
                bitDidSwitch(3,1)
            else
                bitDidSwitch(3,0)
        }
        switch4.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
                bitDidSwitch(4,1)
            else
                bitDidSwitch(4,0)
        }
        switch5.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
                bitDidSwitch(5,1)
            else
                bitDidSwitch(5,0)
        }
        switch6.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
                bitDidSwitch(6,1)
            else
                bitDidSwitch(6,0)
        }
    }
    fun bitDidSwitch(x:Int,operation:Int){
        var postion=1u.shl(x)
        if (operation==1) {
            number = number.or(postion)
        }else{
         number = number.xor(postion)
        }
        changeEdittextcolor()
        textView.text=number.toString()
    }

    fun changeEdittextcolor(){
        if(number.toString()==editTextNumber.text.toString()) {
            editTextNumber.setBackgroundColor(Color.GREEN)
        } else{
            editTextNumber.setBackgroundColor(Color.RED)
        }
    }
}
