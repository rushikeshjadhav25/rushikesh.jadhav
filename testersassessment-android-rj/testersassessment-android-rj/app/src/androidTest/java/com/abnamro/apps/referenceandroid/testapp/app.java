package com.abnamro.apps.referenceandroid.testapp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.matcher.ViewMatchers;

import com.abnamro.apps.referenceandroid.R;

public class app {

    public static ViewInteraction title(){
        return onView(withText("ReferenceAndroid"));
    }

    public static ViewInteraction settingsMenu(){
        return  onView(withContentDescription("More options"));
    }

    public static ViewInteraction settingsButton(){
        return onView(withText("Settings"));
    }

    public static ViewInteraction screenContent(){
        return onView(withText("Hello World!"));
    }

    public static ViewInteraction mailButton(){
        return onView(ViewMatchers.withId(R.id.fab));
    }

    public static ViewInteraction snackBar(){
        return onView(withText("Replace with your own action"));
    }

}
