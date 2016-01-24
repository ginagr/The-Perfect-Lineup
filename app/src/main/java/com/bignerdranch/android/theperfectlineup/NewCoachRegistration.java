package com.bignerdranch.android.theperfectlineup;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class NewCoachRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_coach_registration);

        Button submitBtn = (Button) findViewById(R.id.button_submit);
        submitBtn.setOnClickListener(new View.OnClickListener()  {
            public void onClick(View view) {
               homeScreen();
            }
        });

    }
    public void homeScreen() {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}

