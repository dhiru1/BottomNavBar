package com.example.bottomnavbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.bottomnavbar.fragment.NotificationFragment
import com.example.bottomnavbar.fragment.ProfileFragment
import com.example.bottomnavbar.fragment.ScrollingFragment
import com.example.bottomnavbar.fragment.SearchFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(ScrollingFragment())
        bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> {
                    setContent("Home")
                    loadFragment(ScrollingFragment())
                    true
                }
                R.id.menu_notification -> {
                    setContent("Notification")
                    loadFragment(NotificationFragment())
                    true
                }
                R.id.menu_search -> {
                    setContent("Search")
                    loadFragment(SearchFragment())
                    true
                }
                R.id.menu_profile -> {
                    setContent("Profile")
                    loadFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }

    }

    private fun loadFragment(fragment: Fragment):Boolean {
            if (fragment!=null){
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container,fragment)
                    .commit()
                return true
            }
        return false
    }
    private fun setContent(content: String) {
       // setTitle(content)

       // tvLabel.text = content
    }

}

