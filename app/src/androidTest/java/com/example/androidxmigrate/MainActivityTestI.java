package com.example.androidxmigrate;

import android.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.fragment.app.testing.FragmentScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import junit.framework.TestCase;

import org.jetbrains.annotations.NotNull;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTestI extends TestCase {

    private final String TAG = Utils.getLoggerTag(this.getClass());
    private FragmentMain fragmentMain;

    @Test
    public void dummyTest(){
        FragmentScenario.launch(FragmentMain.class);
    }

    @Before
    public void setUp(){
        FragmentScenario<FragmentMain> scenario = FragmentScenario.launchInContainer(FragmentMain.class);
        scenario.onFragment(new FragmentScenario.FragmentAction<FragmentMain>() {
            @Override
            public void perform(@NotNull FragmentMain frag) {
                fragmentMain = frag;
            }
        });
    }

    @Test
    public void isFragScenarioWork(){
        View view = fragmentMain.getView();
        TextView textView = view.findViewById(R.id.detailsText);
        System.out.println(TAG + textView.getText());
        assertEquals("Hi there!!",textView.getText());
    }


//    @Test
//    public void isAlertWorking() {
//        AlertDialog alertDialog = ShadowAlertDialog.getLatestAlertDialog();
//        ShadowAlertDialog shadowAlertDialog = shadowOf(alertDialog);
//
//        System.out.println("Alert: " + alertDialog);
//    }

}