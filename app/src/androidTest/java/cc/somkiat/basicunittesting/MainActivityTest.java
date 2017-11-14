package cc.somkiat.basicunittesting;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testEmptyNameAndEmptyEmail() {
        onView(withId(R.id.userNameInput)).perform(scrollTo(),replaceText(""));
        onView(withId(R.id.emailInput)).perform(scrollTo(),replaceText(""));
        onView(withId(R.id.saveButton)).perform(scrollTo(), click());
        onView(withId(R.id.revertButton)).perform(scrollTo(), click());

        onView(withId(R.id.userNameInput)).check(matches(withText("")));
        onView(withId(R.id.emailInput)).check(matches(withText("")));

    }

    @Test
    public void testNameAndEmailSaveAndRevert() {
        onView(withId(R.id.userNameInput)).perform(replaceText("PattaSing"), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(replaceText("PattaSing@gmail.com"), closeSoftKeyboard());
        onView(allOf(withId(R.id.saveButton), withText("Save"))).perform(click());
        onView(allOf(withId(R.id.revertButton), withText("Revert"))).perform(click());
        onView(withId(R.id.userNameInput)).check(matches(withText("")));
        onView(withId(R.id.emailInput)).check(matches(withText("")));
    }
}
