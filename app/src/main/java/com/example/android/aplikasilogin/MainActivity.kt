package com.example.android.aplikasilogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //var editText1: String = ""
    //var editText2: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton : Button = findViewById(R.id.button_login)

        button_login.setOnClickListener { login() }
    }

    private fun login(){
        val editText1: String = et_username.text.toString()
        val editText2: String = et_password.text.toString()

        val usernameBenar : String = "fahri"
        val passwordBenar : String = "123"

        if(editText1 == usernameBenar && editText2 == passwordBenar){
            Toast.makeText(this,"Selamat Datang ARMY", Toast.LENGTH_SHORT).show()
        } else if (editText1 == "" || editText2 == ""){
            Toast.makeText(this, "Anda Belum Memasukan Username atau Password", Toast.LENGTH_SHORT).show()
        } else if (editText1 != usernameBenar || editText2 != passwordBenar){
            Toast.makeText(this, "Username atau Password Anda Salah", Toast.LENGTH_SHORT).show()
        } else if(editText1 == usernameBenar && editText2 != passwordBenar){
            Toast.makeText(this, "Password Anda Salah", Toast.LENGTH_SHORT).show()
        } else if(editText1 != usernameBenar && editText2 == passwordBenar){
            Toast.makeText(this, "Username Anda Salah", Toast.LENGTH_SHORT).show()
        }
    }
}
