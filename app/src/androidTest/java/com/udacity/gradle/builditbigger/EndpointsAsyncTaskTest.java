package com.udacity.gradle.builditbigger;

import android.text.TextUtils;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;


@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    private String result = null;

    @Test
    public void jokeLoadedTest() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);

        new EndpointsAsyncTask(new JokeListener() {
            @Override
            public void onJokeLoaded(String joke) {
                result = joke;
                countDownLatch.countDown();
            }
        }).execute();

        try {
            countDownLatch.await();
            assertNotNull("joke is null", result);
            assertFalse("joke is empty", TextUtils.isEmpty(result));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}