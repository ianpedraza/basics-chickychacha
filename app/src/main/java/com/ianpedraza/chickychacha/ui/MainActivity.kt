package com.ianpedraza.chickychacha.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.ianpedraza.chickychacha.databinding.ActivityMainBinding
import com.ianpedraza.chickychacha.utils.viewBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ivChicky.setOnClickListener {
            viewModel.onImagePressed(MainViewModel.CHICKY)
        }

        binding.ivChacha.setOnClickListener {
            viewModel.onImagePressed(MainViewModel.CHACHA)
        }

        binding.ivBoomboom.setOnClickListener {
            viewModel.onImagePressed(MainViewModel.BOOMBOOM)
        }

        viewModel.text.observe(this) { text ->
            text?.let {
                binding.tvName.text = text
            }
        }
    }
}
