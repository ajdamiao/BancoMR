package com.example.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bancomr.databinding.ActivityFaturaBinding
import com.example.bancomr.databinding.ActivityMainBinding
import com.example.bancomr.databinding.ActivitySaldoBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.txtSaldo.setOnClickListener()
        {
            val intent = Intent(this, Saldo::class.java)
            startActivity(intent)
            finish()
        }

        binding.txtFatura.setOnClickListener()
        {
            val intent = Intent(this, Fatura::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnTransferencia.setOnClickListener()
        {
            val intent = Intent(this, Transferencia::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnPoupanca.setOnClickListener()
        {
            val intent = Intent(this, Poupanca::class.java)
            startActivity(intent)
            finish()
        }

    }
}