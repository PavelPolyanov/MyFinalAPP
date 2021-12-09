package com.vertolett.myfinalproject

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.ImageButton
import java.util.*

@SuppressLint("StaticFieldLeak")
lateinit var calendarView: CalendarView

@SuppressLint("StaticFieldLeak")
lateinit var imagebutton: ImageButton

class CalendarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_calendar, container, false)


        calendarView = view.findViewById(R.id.calendar_view)
        imagebutton = view.findViewById(R.id.turn_over)

        imagebutton.setOnClickListener {
            val calendar = Calendar.getInstance()
            calendar.set(
                2021,
                8,
                3
            )
            calendarView.date = calendar.timeInMillis


        }

        return view


    }


}

