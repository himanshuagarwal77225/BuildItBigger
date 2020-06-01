package com.udacity.gradle.builditbigger;

import android.util.Log;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;


@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void jokeTest(){
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(activityTestRule.getActivity());
        try{
            String joke=endpointsAsyncTask.get();
            assertNotNull(joke);
            assertTrue(joke.length()>0);
        }catch (Exception e){
            Log.d("TEST",e.getMessage());
        }
    }
}
