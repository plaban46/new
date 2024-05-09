package com.example.lab_test;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);



    @Test
    public void testButtonClick_Alternate() throws InterruptedException {
        Espresso.onView(ViewMatchers.withId(R.id.et1)).perform(ViewActions.typeText("mystery"));

        Thread.sleep(2000);

        Espresso.onView(ViewMatchers.withId(R.id.et2new)).perform(ViewActions.typeText("CSE"));

        Thread.sleep(2000);

        Espresso.onView(ViewMatchers.withId(R.id.et3)).perform(ViewActions.typeText("KUET"));

        // Click the button three times
        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.button1))
                .perform(ViewActions.click());

        // Check if the text view alternates between "Red!" and "Green!"
        Espresso.onView(ViewMatchers.withId(R.id.tv))
                .check(ViewAssertions.matches(ViewMatchers.withText("[CSE]")));

    }


}
