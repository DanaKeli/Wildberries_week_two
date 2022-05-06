package com.example.wildberries_week_two

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.wildberries_week_two.databinding.ActivityMainBinding


/*   */


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSecondActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        Log.i("Activity lifecycle", "Main activity: onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Activity lifecycle", "Main activity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Activity lifecycle", "Main activity: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Activity lifecycle", "Main activity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Activity lifecycle", "Main activity: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Activity lifecycle", "Main activity: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Activity lifecycle", "Main activity: onDestroy")
    }
}