package com.vertolett.myfinalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.CalendarView
import android.widget.HorizontalScrollView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.*


private const val SAVED_ITEM = "item"

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView
    lateinit var webView: WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView: WebView = findViewById(R.id.google_site)
        webView.loadUrl("http://google.com")



        bottomNavigationView = findViewById(R.id.bottom_menu)
        bottomNavigationView.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.clock_button -> {
                    fragment = ClockFragment()
                }
                R.id.calendar_button -> {
                    fragment = CalendarFragment()
                }
                R.id.app_version -> {
                    fragment = AboutFragment()
                }
            }
            replaceFragment(fragment!!)
            true
        }

        bottomNavigationView.selectedItemId =
            savedInstanceState?.getInt(SAVED_ITEM) ?: R.id.clock_button
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(SAVED_ITEM, bottomNavigationView.selectedItemId)
    }


    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()


    }


}