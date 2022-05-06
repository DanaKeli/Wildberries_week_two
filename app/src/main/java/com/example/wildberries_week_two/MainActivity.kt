package com.example.wildberries_week_two

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.wildberries_week_two.databinding.ActivityMainBinding


/*  Жизненный цикл отражает состояние приложения (активити, фрагмента), которое меняется,
    в следствии действий пользователя. Т.к. в андроиде ресурсы довольно ограничены, то система
    довольно жестко контролирует приложения. В зависимости от состояния активити или фрагмента
    и наличии ресурсов, система принимает решения об уничтожении того или иного приложения.

    Грамотное использование жц позволяет экономить ресурсы, избегать утечек памяти и крашей
    приложения.

    Примеры: 1. Youtube. Воспроизведение видео останавливается при переходе в многоэкранный режим (при
    нажатии на квадратик на системной панели навигации) - onStop.
    2. Секундомер. После запуска секундомера его работа продолжается даже в состоянии onStop и
     onDestroy.
    3. MP3-плеер. При входящем звонке плеер переходит в onPause и воспроизведение музыки останавливается.
     */


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSecondActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        log("onCreate")
    }

    override fun onStart() {
        super.onStart()
        log("onStart")
    }

    override fun onResume() {
        super.onResume()
        log("onResume")
    }

    override fun onPause() {
        super.onPause()
        log("onPause")
    }

    override fun onStop() {
        super.onStop()
        log("onStop")
    }

    override fun onRestart() {
        super.onRestart()
        log("onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("onDestroy")
    }

    private fun log(methodName: String) {
        Log.i("Activity lifecycle", "Main activity: $methodName")
    }
}