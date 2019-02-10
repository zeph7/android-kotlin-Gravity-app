package com.zeph7.gravity.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ListView
import com.zeph7.gravity.R
import com.zeph7.gravity.data.Planet
import com.zeph7.gravity.model.PlanetListAdapter

class WeightActivity : AppCompatActivity() {

    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.requestFeature(Window.FEATURE_NO_TITLE)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_weight)

        var fade = AnimationUtils.loadAnimation(applicationContext, R.anim.fade)

        var planetList = mutableListOf<Planet>()

        planetList.add(Planet("Mercury", R.drawable.ic_mercury, 0.38))
        planetList.add(Planet("Venus", R.drawable.ic_venus, 0.91))
        planetList.add(Planet("Earth", R.drawable.ic_earth, 1.00))
        planetList.add(Planet("Mars", R.drawable.ic_mars, 0.38))
        planetList.add(Planet("Jupiter", R.drawable.ic_jupiter, 2.34))
        planetList.add(Planet("Saturn", R.drawable.ic_saturn, 1.06))
        planetList.add(Planet("Uranus", R.drawable.ic_uranus, 0.92))
        planetList.add(Planet("Neptune", R.drawable.ic_neptune, 1.19))

        val adapter = PlanetListAdapter(this, R.layout.planet_list_item, planetList)
        listView = findViewById(R.id.listViewId)
        listView.adapter = adapter

        listView.setOnItemClickListener { adapterView, view, position, id ->
            view.startAnimation(fade)
            when (position) {
                0 -> {
                    startActivity(Intent(this, PlanetActivity::class.java).putExtra
                        ("planet", Planet("Mercury", R.drawable.img_mercury, 0.38)))
                }
                1 -> {
                    startActivity(Intent(this, PlanetActivity::class.java).putExtra
                        ("planet", Planet("Venus", R.drawable.img_venus, 0.91)))
                }
                2 -> {
                    startActivity(Intent(this, PlanetActivity::class.java).putExtra
                        ("planet", Planet("Earth", R.drawable.img_earth, 1.00)))
                }
                3 -> {
                    startActivity(Intent(this, PlanetActivity::class.java).putExtra
                        ("planet", Planet("Mars", R.drawable.img_mars, 0.38)))
                }
                4 -> {
                    startActivity(Intent(this, PlanetActivity::class.java).putExtra
                        ("planet", Planet("Jupiter", R.drawable.img_jupiter, 2.34)))
                }
                5 -> {
                    startActivity(Intent(this, PlanetActivity::class.java).putExtra
                        ("planet", Planet("Saturn", R.drawable.img_saturn, 1.06)))
                }
                6 -> {
                    startActivity(Intent(this, PlanetActivity::class.java).putExtra
                        ("planet", Planet("Uranus", R.drawable.img_uranus, 0.92)))
                }
                7 -> {
                    startActivity(
                        Intent(this, PlanetActivity::class.java).putExtra
                            ("planet", Planet("Neptune", R.drawable.img_neptune, 1.19))
                    )
                }
            }
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, MainActivity::class.java))
    }
}
