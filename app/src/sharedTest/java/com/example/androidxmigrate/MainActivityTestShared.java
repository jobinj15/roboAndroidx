//package com.example.androidxmigrate;
//
//import androidx.fragment.app.testing.FragmentScenario;
//
//import junit.framework.TestCase;
//
//import org.jetbrains.annotations.NotNull;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.robolectric.RobolectricTestRunner;
//import org.robolectric.annotation.Config;
//
//@RunWith(RobolectricTestRunner.class)
//@Config(sdk = 28)
//public class MainActivityTestShared extends TestCase {
//
//    public void tearDown() throws Exception {
//    }
//
//    @Test
//    public void dummyTest(){
//        FragmentScenario.launch(FragmentMain.class);
//    }
//
//    @Test
//    public void isFragScenarioWork(){
//        FragmentScenario<FragmentMain> scenario = FragmentScenario.launchInContainer(FragmentMain.class);
//        scenario.onFragment(new FragmentScenario.FragmentAction<FragmentMain>() {
//            @Override
//            public void perform(@NotNull FragmentMain fragmentMain) {
//
//            }
//        });
//    }
//}