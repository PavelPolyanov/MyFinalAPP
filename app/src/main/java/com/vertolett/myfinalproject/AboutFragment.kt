package com.vertolett.myfinalproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class AboutFragment : Fragment() {

    lateinit var aboutApplicationRecycleView: RecyclerView
    lateinit var donateButton: FloatingActionButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about, container, false)
        val appVersionHistoryNumber: List<String> = listOf(
            "Версия 1.0.1 от 01.12.2021",
            "Версия 1.0.2 от 05.12.2021",
            "Версия 1.0.3 от 08.12.2021"
        )

        aboutApplicationRecycleView = view.findViewById(R.id.about_application_recycleView)
        aboutApplicationRecycleView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        aboutApplicationRecycleView.adapter = AppVersionAdapter(appVersionHistoryNumber)

        donateButton = view.findViewById(R.id.donate_button)
        donateButton.setOnClickListener {
            val link = Uri.parse("https://patreon.com")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)

        }

        return view
    }


}