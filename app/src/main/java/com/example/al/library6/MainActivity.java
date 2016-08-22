package com.example.al.library6;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.al.androidjoke.AndroidLibActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchLibraryActivity(View view){
        Log.i("appMain", "AndoidLib");
        Intent myIntent = new Intent(this, AndroidLibActivity.class);
        startActivity(myIntent);
    }


}