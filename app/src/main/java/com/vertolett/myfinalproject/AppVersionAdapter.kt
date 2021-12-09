package com.vertolett.myfinalproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AppVersionAdapter(private val appVersionHistoryNumber: List<String>) :RecyclerView.Adapter<AppVersionViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppVersionViewHolder {
        val itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.application_version_list_item,parent,false)
        return AppVersionViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AppVersionViewHolder, position: Int) {
        val name = appVersionHistoryNumber[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return appVersionHistoryNumber.size
    }
}