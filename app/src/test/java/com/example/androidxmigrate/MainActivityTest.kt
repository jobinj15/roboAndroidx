package com.example.androidxmigrate


import androidx.fragment.app.testing.FragmentScenario
import junit.framework.TestCase
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
class MainActivityTest : TestCase() {
    @Test
    fun justCheck() {
        assertEquals(2 + 2, 4)
    }

    @Test
    fun isFragmentScenario(){

        val scenario = FragmentScenario.launchInContainer(FragmentMain::class.java)


    }

}