package com.internview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {
    lateinit var btnLogin: AppCompatButton
    lateinit var txtEmail: EditText
    lateinit var txtPassWord: EditText
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_first, container, false)
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
            if (txtEmail.text.toString().trim() == "")
                Toast.makeText(activity, "Please enter Email!", Toast.LENGTH_SHORT).show()
            if (txtPassWord.text.toString().trim() == "")
                Toast.makeText(activity, "Please enter Password!", Toast.LENGTH_SHORT).show()
        }
    }
}