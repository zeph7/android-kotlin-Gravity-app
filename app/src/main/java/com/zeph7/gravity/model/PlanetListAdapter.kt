package com.zeph7.gravity.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.zeph7.gravity.R
import com.zeph7.gravity.data.Planet

class PlanetListAdapter (var mCtx: Context, var resource: Int, var items: List<Planet>):
    ArrayAdapter<Planet>(mCtx, resource, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)

        // from this view we will get image button and textview
        val view: View = layoutInflater.inflate(resource, null)

        val image: ImageView = view.findViewById(R.id.planetImageIcon)
        val textView: TextView = view.findViewById(R.id.planetName)
        val textView2: TextView = view.findViewById(R.id.planetGravity)

        val planet: Planet = items[position]
        image.setImageDrawable(mCtx.resources.getDrawable(planet.Image))
        textView.text = planet.Name
        textView2.text = "gravity: ${planet.Gravity}"
        return view
    }

}