package com.abnamro.apps.referenceandroid.tests;

import static com.abnamro.apps.referenceandroid.testapp.app.*;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import com.abnamro.apps.referenceandroid.MainActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class appTests {

    /**
     * Invoke Android Test App
     */
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    /**
     * Given Tester invokes Android App
     * When ReferenceAndroid Screen Appears
     * Then Title should be displayed
     */
    @Test
    public void testCheckTitle(){
        title().check(matches(isDisplayed()));
    }

    /**
     * Given Tester invokes Android App
     * When ReferenceAndroid Screen Appears
     * Then Content should be displayed
     */
    @Test
    public void testCheckContent(){
        screenContent().check(matches(isDisplayed()));
    }

    /**
     * Given Tester is on ReferenceAndroid Screen
     * when Clicked on Settings Menu Options
     * Then Settings should be displayed
     */
    @Test
    public void testSettingsMenu(){
        settingsMenu().perform(click());
        settingsButton().check(matches(isDisplayed()));
    }

    /**
     * Given Tester is on ReferenceAndroid screen
     * When clicked on Settings under Settings Menu
     * Then Settings should disappear
     */
    @Test
    public void testSettingsMenuOption(){
        settingsMenu().perform(click());
        settingsButton().check(matches(isDisplayed()));
        settingsButton().perform(click());
        settingsButton().check(doesNotExist());
    }

    /**
     * Given Tester is on ReferenceAndroid Screen
     * when clicked on Mail Button
     * Then snack bar should be displayed
     */
    @Test
    public void testClickMailButton(){
        mailButton().perform(click());
        snackBar().check(matches(isDisplayed()));
    }

}
