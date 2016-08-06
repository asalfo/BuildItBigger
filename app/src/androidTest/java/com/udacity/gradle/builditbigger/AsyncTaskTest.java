package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import com.udacity.gradle.builditbigger.service.JokeAsyncTask;



/**
 * Created by asalfo on 03/08/16.
 */

public class AsyncTaskTest extends AndroidTestCase {
    public void testVerifyTellJoke() throws Exception {

     new JokeAsyncTask(new JokeAsyncTask.AsyncResponseListner() {
            @Override
            public void onFinish(String result) {

                assertNotNull(result);
                assertTrue(result.length() > 0);
            }
        }).execute();

    }
}
