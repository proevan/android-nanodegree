package com.proevan.androidnanodegree;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Toast;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super(MainActivity.class);
    }

    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    // test case block start
    public void testSpotifyStreamerButtonClick() throws Exception {
        // arrange
        waitForPreviousToastDismiss(Toast.LENGTH_SHORT);

        // act
        onView(withId(R.id.app_button_spotify_streamer))
                .perform(click());

        // assert
        checkToastIsDisplayed(R.string.spotify_streamer_app_button_hint);
    }

    public void testFootballScoresButtonClick() throws Exception {
        // arrange
        waitForPreviousToastDismiss(Toast.LENGTH_SHORT);

        // act
        onView(withId(R.id.app_button_football_scores))
                .perform(click());

        // assert
        checkToastIsDisplayed(R.string.football_scores_app_button_hint);
    }

    public void testLibraryAppButtonClick() throws Exception {
        // arrange
        waitForPreviousToastDismiss(Toast.LENGTH_SHORT);

        // act
        onView(withId(R.id.app_button_library_app))
                .perform(click());

        // assert
        checkToastIsDisplayed(R.string.library_app_button_hint);
    }

    public void testBuildItBiggerButtonClick() throws Exception {
        // arrange
        waitForPreviousToastDismiss(Toast.LENGTH_SHORT);

        // act
        onView(withId(R.id.app_button_build_it_bigger))
                .perform(click());

        // assert
        checkToastIsDisplayed(R.string.build_it_bigger_app_button_hint);
    }

    public void testXYZReaderButtonClick() throws Exception {
        // arrange
        waitForPreviousToastDismiss(Toast.LENGTH_SHORT);

        // act
        onView(withId(R.id.app_button_xyz_reader))
                .perform(click());

        // assert
        checkToastIsDisplayed(R.string.xyz_reader_app_button_hint);
    }

    public void testMyOwnAppButtonClick() throws Exception {
        // arrange
        waitForPreviousToastDismiss(Toast.LENGTH_SHORT);

        // act
        onView(withId(R.id.app_button_my_own_app))
                .perform(click());

        // assert
        checkToastIsDisplayed(R.string.my_own_app_button_hint);
    }
    // test case block end

    private void waitForPreviousToastDismiss(int duration) throws InterruptedException {
        int durationInMillisecond;

        if (duration == Toast.LENGTH_SHORT)
            durationInMillisecond = 2000;
        else if (duration == Toast.LENGTH_LONG)
            durationInMillisecond = 3500;
        else
            durationInMillisecond = duration;

        Thread.sleep(durationInMillisecond);
    }

    private void checkToastIsDisplayed(int stringResId) {
        onView(withText(stringResId)).inRoot(withDecorView(not(is(getActivity().getWindow().getDecorView()))))
                .check(matches(isDisplayed()));
    }
}