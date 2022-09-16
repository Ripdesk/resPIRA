package com.example.respira


import android.graphics.drawable.AnimatedImageDrawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.ViewAnimator
import de.hdodenhof.circleimageview.CircleImageView

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val image = findViewById<CircleImageView>(R.id.animacao)
        image.setOnClickListener() {
            Handler().postDelayed({
                image.setImageResource(R.drawable.pulmao_background)
            }, 3000)

        }

    }

//    fun runRespira(){
//        Handler().postDelayed({
//
//        }, 10000)
//    }
}