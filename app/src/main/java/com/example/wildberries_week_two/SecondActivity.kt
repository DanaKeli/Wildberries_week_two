package com.example.wildberries_week_two

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.wildberries_week_two.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowDialog.setOnClickListener {
            showDialog()
        }
        binding.btnBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("Activity lifecycle", "Second activity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Activity lifecycle", "Second activity: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Activity lifecycle", "Second activity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Activity lifecycle", "Second activity: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Activity lifecycle", "Second activity: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Activity lifecycle", "Second activity: onDestroy")
    }

    private fun showDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Пример диалога")
            .setPositiveButton("Ок") { dialog, _ ->
                dialog.cancel()
            }
            .show()
    }
}