package com.bignerdranch.android.theperfectlineup;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;


public class MainActivity extends Activity {
    private final boolean DATA_FOUND = true;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.os.SystemClock.sleep(6000);
        if(DATA_FOUND){
            // redirect to home screen
            homeScreen();
        } else {
            // redirect to registration
            registrationScreen();
        }
    }

    public void homeScreen() {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }

    public void registrationScreen() {
        Intent intent = new Intent(this, NewCoachRegistration.class);
        startActivity(intent);
    }


}