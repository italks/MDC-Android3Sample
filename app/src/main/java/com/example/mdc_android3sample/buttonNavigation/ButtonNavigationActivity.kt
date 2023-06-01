package com.example.mdc_android3sample.buttonNavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mdc_android3sample.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class ButtonNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_navigation)
        val  bottomNavigation:BottomNavigationView =findViewById(R.id.bottom_navigation)

        NavigationBarView.OnItemSelectedListener { item ->when(item.itemId) {
            R.id.item_1 -> {
                // Respond to navigation item 1 click

                true
            }
            R.id.item_2 -> {
                val badgeDrawable = bottomNavigation.getBadge(R.id.item_1)
                if (badgeDrawable != null) {
                    badgeDrawable.isVisible = false
                    badgeDrawable.clearNumber()  // or badgeDrawable.clearText()
                }
                // Respond to navigation item 2 click
                true
            }
            else -> false
        }
        }
        bottomNavigation.setOnItemReselectedListener { item ->
            when(item.itemId) {
                R.id.item_1 -> {
                    // Respond to navigation item 1 reselection

                }
                R.id.item_2 -> {
                    // Respond to navigation item 2 reselection
                    bottomNavigation.removeBadge(R.id.item_1)
                }
            }
        }
        var badge = bottomNavigation.getOrCreateBadge(R.id.item_1)
        badge.isVisible = true
// An icon only badge will be displayed unless a number or text is set:
        badge.number = 99  // or badge.text = "New"
        bottomNavigation.selectedItemId = R.id.item_2


    }
}