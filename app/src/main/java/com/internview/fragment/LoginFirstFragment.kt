package com.internview.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.internview.R
import com.internview.activity.MainActivity

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class LoginFirstFragment : Fragment() {
    lateinit var btnLogin: AppCompatButton
    lateinit var txtEmail: EditText
    lateinit var txtPassWord: EditText
    val loginEmail = "buihuyhoang2712962gmail.com"
    val loginpassword = "Hoang@2712"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_login_first, container, false)
    }

    /**
     *
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnLogin = view.findViewById(R.id.btn_login)
        txtEmail = view.findViewById(R.id.txt_email)
        txtPassWord = view.findViewById(R.id.txt_pass_word)
        btnLogin.setOnClickListener {
            val intent = Intent (context, MainActivity::class.java)
            /* start your next activity */
            if (txtEmail.text.toString().trim() == "")
                Toast.makeText(activity, "Please enter Email!", Toast.LENGTH_SHORT).show()
            if (txtPassWord.text.toString().trim() == "")
                Toast.makeText(activity, "Please enter Password!", Toast.LENGTH_SHORT).show()
            if (txtEmail.text.toString().trim() == loginEmail && txtPassWord.text.toString().trim() == loginpassword) {
                context?.startActivity(intent)
            }
            context?.startActivity(intent)
                }
        }
    }
