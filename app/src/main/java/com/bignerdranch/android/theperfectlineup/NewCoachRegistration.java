package com.bignerdranch.android.theperfectlineup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewCoachRegistration extends AppCompatActivity {
    private Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_coach_registration);
        submitBtn = (Button) findViewById(R.id.button_submit);

    }
}

