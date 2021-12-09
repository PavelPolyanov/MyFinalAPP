package com.vertolett.myfinalproject

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AppVersionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val applicationVersionTextView: TextView =
        itemView.findViewById(R.id.application_version_text_view)

    fun bind(name:String){
        applicationVersionTextView.text = name


    }
}