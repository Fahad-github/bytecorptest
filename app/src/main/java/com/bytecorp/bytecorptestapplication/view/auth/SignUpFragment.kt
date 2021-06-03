package com.bytecorp.bytecorptestapplication.view.auth

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.bytecorp.bytecorptestapplication.R
import com.bytecorp.bytecorptestapplication.databinding.FragmentLoginBinding
import com.bytecorp.bytecorptestapplication.databinding.FragmentSignUpBinding
import com.bytecorp.bytecorptestapplication.utils.afterTextChanged
import com.bytecorp.bytecorptestapplication.view.base.BaseFragment
import kotlin.system.exitProcess

class SignUpFragment : BaseFragment() {

    lateinit var binding : FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = binding<FragmentSignUpBinding>(inflater, R.layout.fragment_sign_up, container)
            .apply {
                lifecycleOwner = viewLifecycleOwner
            }

        binding.tvLogin.setOnClickListener {
            val action = SignUpFragmentDirections.actionSignUpFragmentToLoginFragment2()
            it.findNavController().navigate(action)
        }

        binding.buttonSignUp.setOnClickListener {
            val action = SignUpFragmentDirections.actionSignUpFragmentToLoginFragment2()
            it.findNavController().navigate(action)
        }

        binding.ivCross.setOnClickListener{
            exitProcess(0)
        }

        binding.etPassword.afterTextChanged {
            if (binding.etUserName.text!!.isNotEmpty()) {
                if(binding.etEmail.text!!.isNotEmpty()){
                    binding.buttonSignUp.isEnabled = it.isNotEmpty()
                }
            }
        }


        return binding.root
    }

}