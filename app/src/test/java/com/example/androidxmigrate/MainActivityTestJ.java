package com.example.androidxmigrate;

import android.app.AlertDialog;

import androidx.fragment.app.testing.FragmentScenario;

import junit.framework.TestCase;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowAlertDialog;

import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTestJ extends TestCase {


    @Test
    public void justCheck() {
        assertEquals(2 + 2, 4);
    }

    @Test
    public void isFragScenarioWork() {
        FragmentScenario<FragmentMain> scenario = FragmentScenario.launchInContainer(FragmentMain.class);
        scenario.onFragment(new FragmentScenario.FragmentAction<FragmentMain>() {
            @Override
            public void perform(@NotNull FragmentMain fragmentMain) {

            }
        });
    }


    @Test
    public void isAlertWorking() {
        AlertDialog alertDialog = ShadowAlertDialog.getLatestAlertDialog();
        ShadowAlertDialog shadowAlertDialog = shadowOf(alertDialog);
    
        System.out.println("Alert: " + alertDialog);
    }


}