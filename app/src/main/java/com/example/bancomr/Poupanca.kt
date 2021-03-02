package com.example.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bancomr.databinding.ActivityPoupancaBinding

class Poupanca : AppCompatActivity() {
    private lateinit var binding: ActivityPoupancaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        var binding = ActivityPoupancaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val toolbar = binding.toolbarPoupanca;
        toolbar.title = "Poupança"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(300,0,400,0)
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        toolbar.setBackgroundColor(getColor(R.color.light_blue))


        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()

    }
}