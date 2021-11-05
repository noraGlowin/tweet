package com.example.tweet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tweet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
binding.like.setOnClickListener { Toast.makeText(this, "Hi Im like button ♥", Toast.LENGTH_SHORT).show()}
 binding.share.setOnClickListener { Toast.makeText(this, "Hi Im share button ☺", Toast.LENGTH_SHORT).show()}
        binding.reply.setOnClickListener { Toast.makeText(this, "Hi Im reply button ★", Toast.LENGTH_SHORT).show()}
        binding.retweet.setOnClickListener { Toast.makeText(this, "Hi Im retweet button 〠", Toast.LENGTH_SHORT).show()}
    }
}