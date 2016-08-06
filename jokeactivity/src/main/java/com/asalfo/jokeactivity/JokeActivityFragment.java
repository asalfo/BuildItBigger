package com.asalfo.jokeactivity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class JokeActivityFragment extends Fragment {

    public static final String JOKE_KEY = "jokeKey";
    private String mJoke;
    TextView mJokeTextView;

    public JokeActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_joke_activity, container, false);

        Intent intent = getActivity().getIntent();
        if(intent != null){
            mJoke = intent.getStringExtra(JOKE_KEY);
        } else{
            mJoke = "I have no jokes =(";
        }

        mJokeTextView = (TextView) rootView.findViewById(R.id.joke_text);
        mJokeTextView.setText(mJoke);

        return rootView;
    }



    //Returns an intent attached with a joke
    public static Intent getJokeIntent(Context context, String aJoke){
        Intent intent = new Intent(context, JokeActivity.class);
        intent.putExtra(JOKE_KEY, aJoke);
        return intent;
    }

}
