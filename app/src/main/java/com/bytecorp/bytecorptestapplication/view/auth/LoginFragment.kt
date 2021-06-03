package com.bytecorp.bytecorptestapplication.view.auth

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.bytecorp.bytecorptestapplication.R
import com.bytecorp.bytecorptestapplication.databinding.FragmentLoginBinding
import com.bytecorp.bytecorptestapplication.utils.afterTextChanged
import com.bytecorp.bytecorptestapplication.view.base.BaseFragment
import com.bytecorp.bytecorptestapplication.view.home.MainActivity


class LoginFragment : BaseFragment() {

    lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = binding<FragmentLoginBinding>(inflater, R.layout.fragment_login, container)
            .apply {
                lifecycleOwner = viewLifecycleOwner
            }
        binding.buttonSignIn.setOnClickListener {
            startActivity(Intent(context,MainActivity::class.java))
        }

        binding.etPassword.afterTextChanged {
            if (binding.etUserName.text!!.isNotEmpty()) {
                binding.buttonSignIn.isEnabled = it.isNotEmpty()
            }
        }

        return binding.root
    }


}