package com.example.simpletextsaver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val splahTime = object :Thread() {
            override fun run() {
                super.run()
                try {
                    Thread.sleep(4000)
                }catch (e:Exception) {

                }finally {
                    startActivity(Intent(this@SplashScreen,MainActivity::class.java))
                }
            }
        }
        splahTime.start()

    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}