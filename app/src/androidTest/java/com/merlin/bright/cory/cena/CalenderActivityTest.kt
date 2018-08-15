package com.merlin.bright.cory.cena

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.contrib.DrawerActions
import android.support.test.espresso.contrib.NavigationViewActions
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class CalenderActivityTest {
    private lateinit var stringToUse: String

    @get:Rule
    var mActivityRule = ActivityTestRule<CalenderActivity>(CalenderActivity::class.java)

//    @Before
//    fun initValidString(){
//        stringToUse = "String"
//    }

    @Test
    fun drawerLaunchRecipeList() {
        onView(withId(R.id.drawer_layout)).perform(DrawerActions.open())
        onView(withId(R.id.nav_view)).perform(NavigationViewActions.navigateTo(R.id.nav_Recipes))
    }
}