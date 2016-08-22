package com.example.al.library6;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.JokeWizard;

public class MainActivityFragment extends Fragment {


    public MainActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        View rootView = inflater.inflate(R.layout.android_lib_fragment_activity, container, false);
//        JokeWizard jokeWizard = new JokeWizard();
//        TextView myAwesomeTextView = (TextView)rootView.findViewById(R.id.joke_text);
//        myAwesomeTextView.setText(jokeWizard.tellJoke());
//        Log.i("MainFrag",jokeWizard.tellJoke());
        return inflater.inflate(R.layout.fragment_main_activity, container, false);
    }
}
