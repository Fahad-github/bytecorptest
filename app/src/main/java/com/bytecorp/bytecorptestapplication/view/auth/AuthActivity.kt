package com.bytecorp.bytecorptestapplication.view.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bytecorp.bytecorptestapplication.R
import com.bytecorp.bytecorptestapplication.databinding.ActivityAuthBinding
import com.bytecorp.bytecorptestapplication.view.base.BaseActivity

class AuthActivity : BaseActivity() {

    private val binding: ActivityAuthBinding by binding(R.layout.activity_auth)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this@AuthActivity
    }
}