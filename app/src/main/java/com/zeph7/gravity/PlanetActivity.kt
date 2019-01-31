package com.zeph7.gravity

import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.text.TextUtils
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_planet.*
import java.lang.Double.parseDouble

class PlanetActivity : AppCompatActivity() {


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.requestFeature(Window.FEATURE_NO_TITLE)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        overridePendingTransition(R.anim.fade_in_transition, R.anim.fade_out_transition)
        setContentView(R.layout.activity_planet)

        var planet = intent.getSerializableExtra("planet") as Planet
        planetImageId.setImageDrawable(application.getDrawable(planet.Image))
        planetNameId.text = planet.Name

        var anim = AnimationUtils.loadAnimation(applicationContext, R.anim.clockwise)
        planetImageId.startAnimation(anim)

        planetImageId.setOnClickListener {
            anim = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
            planetImageId.startAnimation(anim)
        }

        showWeightId.setOnClickListener {
            if (TextUtils.isEmpty(enterWeightId.text.toString())) {
                showResultId.text = "Please enter weight !!"
            }
            else if (!checkValid(enterWeightId.text.toString())) {
                showResultId.text = "Please enter a valid weight !!"
            }
            else {
                showResultId.text = calculateWeight(planet.Name, enterWeightId.text.toString().
                    toDouble(), planet.Gravity)
            }
        }

        planetNameId.setOnClickListener {
            startActivity(
                Intent(this, PlanetInfoActivity::class.java).putExtra
                    ("planet", Planet(planet.Name, planet.Image, planet.Gravity))
            )
        }
    }

    fun calculateWeight(planet: String, userWeight: Double, gravity: Double): String {
        var result: Double?
        var Weight: String = ""
        result = userWeight * gravity
        Weight = "Your weight is ${result.format(2)} kg On $planet"
        return Weight

    }

    // function for getting decimal result upto 2 decimal places
    fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f", this)

    fun checkValid(input: String): Boolean {
        var numeric = true
        try {
            val num = parseDouble(input)
        } catch (e: NumberFormatException) {
            numeric = false
        }
        return numeric
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, WeightActivity::class.java))
    }


}
