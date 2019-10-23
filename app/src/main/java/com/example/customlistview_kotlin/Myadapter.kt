package com.example.customlistview_kotlin

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView


class Myadapter(private val context: Activity,
                private val title: Array<String>,
                private val description: Array<String>):ArrayAdapter<String>(context, R.layout.custom_list, title)

{
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
    val inflater = context.layoutInflater

    val rowView = inflater.inflate(R.layout.custom_list, null, true)
    val titleText = rowView.findViewById(R.id.text1) as TextView
    val subtitleText = rowView.findViewById(R.id.text2) as TextView
    titleText.text = title[position]
    subtitleText.text = description[position]

    return rowView
}
}

