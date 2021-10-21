package com.manati.visitor.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.manati.visitor.R

class AdapterCar(var mCtx: Context, var resources:Int, var items:List<ModelCar>):ArrayAdapter<ModelCar>(mCtx, resources, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resources, null)

        val imageView: ImageView = view.findViewById(R.id.imageVisit)
        val placaTextView: TextView = view.findViewById(R.id.nameVisit1)
        val marcaTextView: TextView = view.findViewById(R.id.idVisit1)

        var mItem:ModelCar = items.get(position)
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        placaTextView.text = mItem.placa
        marcaTextView.text = mItem.marca
        return view
    }

}


