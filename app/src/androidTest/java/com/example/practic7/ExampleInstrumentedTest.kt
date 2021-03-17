package com.example.practic7

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.practic7", appContext.packageName)
    }
    @get:Rule
    var activityScenarioRule = ActivityScenarioRule<MainActivity>(MainActivity::class.java)
    @Test
    fun checktest(){
        onView(withId(R.id.editText1)).perform(typeText("1"))
        onView(withId(R.id.editText2)).perform(typeText("2"))
        onView(withId(R.id.editText3)).perform(typeText("3"))
        onView(withId(R.id.editText4)).perform(typeText("4"))
        onView(withId(R.id.editText5)).perform(typeText("5"))
        onView(withId(R.id.editText6)).perform(typeText("6"))
        onView(withId(R.id.editText7)).perform(typeText("7"))
        onView(withId(R.id.editText8)).perform(typeText("8"))
        onView(withId(R.id.editText9)).perform(typeText("9"))
        onView(withId(R.id.button)).perform(click())
        onView(withId(R.id.text1)).check(matches(withText("3")))
        onView(withId(R.id.text2)).check(matches(withText("-6")))
        onView(withId(R.id.text3)).check(matches(withText("3")))
        onView(withId(R.id.text4)).check(matches(withText("-6")))
        onView(withId(R.id.text5)).check(matches(withText("12")))
        onView(withId(R.id.text6)).check(matches(withText("-6")))
        onView(withId(R.id.text7)).check(matches(withText("3")))
        onView(withId(R.id.text8)).check(matches(withText("-6")))
        onView(withId(R.id.text9)).check(matches(withText("3")))





    }
}