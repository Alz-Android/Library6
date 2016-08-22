package com.example.al.library6;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.al.androidjoke.AndroidLibActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        checkPlayServices();
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        checkPlayServices();
    }

    private boolean checkPlayServices() {
        GoogleApiAvailability googleAPI = GoogleApiAvailability.getInstance();
        int result = googleAPI.isGooglePlayServicesAvailable(this);
        if(result != ConnectionResult.SUCCESS) {
            if(googleAPI.isUserResolvableError(result)) {
                //TODO: constant 1 used temporarily for Error Dialog
                googleAPI.getErrorDialog(this, result, 1).show();
            }
            return false;
        }
        return true;
    }

    public void launchLibraryActivity(View view){
        Log.i("appMain", "AndoidLib");
        Intent myIntent = new Intent(this, AndroidLibActivity.class);
        startActivity(myIntent);
    }
}