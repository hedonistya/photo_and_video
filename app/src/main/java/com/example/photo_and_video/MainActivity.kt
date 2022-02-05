package com.example.photo_and_video

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.photo_and_video.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.btnPhoto.setOnClickListener {
      val takePhoto = Intent(Intent.ACTION_PICK)
      takePhoto.type = "image/*"
      startActivityForResult(takePhoto, 1)
    }

    binding.btnVideo.setOnClickListener {
      val takePhoto = Intent(Intent.ACTION_PICK)
      takePhoto.type = "video/*"
      startActivityForResult(takePhoto, 1)
    }
  }
}