package com.example.photo_and_video

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.photo_and_video.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
  private lateinit var binding: ActivityStartBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityStartBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.btnGetStarted.setOnClickListener {
      val mainActivity = Intent(this, MainActivity::class.java)
      startActivity(mainActivity)
    }
  }
}