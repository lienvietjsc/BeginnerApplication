package com.internview.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.internview.R
import com.internview.activity.MainActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.CustomAdapter
import androidx.recyclerview.widget.RecyclerView

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class LoginActivity : AppCompatActivity()
{
    lateinit var btnLogin: AppCompatButton
    lateinit var txtEmail: EditText
    lateinit var txtPassWord: EditText
    val loginEmail = "buihuyhoang271296@gmail.com"
    val loginpassword = "Hoang@2712"
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin = findViewById(R.id.btn_login)
        txtEmail = findViewById(R.id.txt_email)
        txtPassWord = findViewById(R.id.txt_pass_word)
        btnLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            /* start your next activity */
            if (txtEmail.text.toString().trim() == "") Toast.makeText(applicationContext,"Please enter Email!", Toast.LENGTH_SHORT).show()
            if (txtPassWord.text.toString().trim() == "") Toast.makeText(applicationContext,"Please enter Password!", Toast.LENGTH_SHORT)
                .show()
            if (txtEmail.text.toString().trim() != loginEmail || txtPassWord.text.toString().trim() != loginpassword)
            {
                Toast.makeText(applicationContext, "Password or Email is wrong!!!", Toast.LENGTH_SHORT).show()
            }else{
                startActivity(intent)
            }
        }
    }
}
