package br.dev.gustavosouza.salariomensal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var maxSplashTime: Long = 5000
        var progressSplash: Long = 0
        var percentResult = maxSplashTime / 101

        for (x in 0..100){
            Handler().postDelayed({
                progressSplashBar.progress = x
            }, progressSplash)
            progressSplash = progressSplash + percentResult
        }
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, maxSplashTime)
    }
}