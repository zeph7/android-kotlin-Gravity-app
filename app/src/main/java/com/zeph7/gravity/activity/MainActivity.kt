package com.zeph7.gravity.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager
import com.zeph7.gravity.data.Planet
import com.zeph7.gravity.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.requestFeature(Window.FEATURE_NO_TITLE)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        overridePendingTransition(
            R.anim.fade_in_transition,
            R.anim.fade_out_transition
        )
        setContentView(R.layout.activity_main)

        weightOnPlanetId.setOnClickListener {
            startActivity(Intent(this, WeightActivity::class.java))
        }

        mercuryId.setOnClickListener {
            startActivity(
                Intent(this, PlanetInfoActivity::class.java).putExtra
                    ("planet", Planet("Mercury", R.drawable.img_mercury, 0.38))
            )
        }
        venusId.setOnClickListener {
            startActivity(
                Intent(this, PlanetInfoActivity::class.java).putExtra
                    ("planet", Planet("Venus", R.drawable.img_venus, 0.91))
            )
        }
        earthId.setOnClickListener {
            startActivity(
                Intent(this, PlanetInfoActivity::class.java).putExtra
                    ("planet", Planet("Earth", R.drawable.img_earth, 1.00))
            )
        }
        marsId.setOnClickListener {
            startActivity(
                Intent(this, PlanetInfoActivity::class.java).putExtra
                    ("planet", Planet("Mars", R.drawable.img_mars, 0.38))
            )
        }
        jupiterId.setOnClickListener {
            startActivity(
                Intent(this, PlanetInfoActivity::class.java).putExtra
                    ("planet", Planet("Jupiter", R.drawable.img_jupiter, 2.34))
            )
        }
        saturnId.setOnClickListener {
            startActivity(
                Intent(this, PlanetInfoActivity::class.java).putExtra
                    ("planet", Planet("Saturn", R.drawable.img_saturn, 1.06))
            )
        }
        uranusId.setOnClickListener {
            startActivity(
                Intent(this, PlanetInfoActivity::class.java).putExtra
                    ("planet", Planet("Uranus", R.drawable.img_uranus, 0.92))
            )
        }
        neptuneId.setOnClickListener {
            startActivity(
                Intent(this, PlanetInfoActivity::class.java).putExtra
                    ("planet", Planet("Neptune", R.drawable.img_neptune, 1.19))
            )

        }
        sunId.setOnClickListener {
            startActivity(
                Intent(this, PlanetInfoActivity::class.java).putExtra
                    ("planet", Planet("Sun", R.drawable.img_sun, 27.6))
            )
        }
        spaceId.setOnClickListener {
            startActivity(
                Intent(this, PlanetInfoActivity::class.java).putExtra
                    ("planet", Planet("Space", R.drawable.img_space, 0.0))
            )
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        moveTaskToBack(true)
    }

}
