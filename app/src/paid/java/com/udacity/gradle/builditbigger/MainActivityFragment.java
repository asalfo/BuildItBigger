package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.asalfo.jokeactivity.JokeActivityFragment;

import com.udacity.gradle.builditbigger.service.JokeAsyncTask;

public class MainActivityFragment extends Fragment {

    public static final int JOKE_ACTIVITY_REQ_CODE = 1;
    Button mJkButton;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        mJkButton = (Button) root.findViewById(R.id.jkButton);
        mJkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new JokeAsyncTask(new JokeAsyncTask.AsyncResponseListner() {
                    @Override
                    public void onFinish(String result) {
                        Intent intent = JokeActivityFragment.getJokeIntent(getActivity(), result);
                        startActivityForResult(intent, JOKE_ACTIVITY_REQ_CODE);
                    }
                }).execute();
            }
        });

        return root;
    }

}
