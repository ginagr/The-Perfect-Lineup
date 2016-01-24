package com.bignerdranch.android.theperfectlineup;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.LinkedList;

public class NewCoachRegistration extends AppCompatActivity {

    public static LinkedList rowerList;
    public static LinkedList coxswainList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_coach_registration);

        Button addRowBtn = (Button) findViewById(R.id.button_add_rower);
        addRowBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                addRowerDisplay();
            }
        });

        // Add Coxswain Button
        Button addCoxswainBtn = (Button) findViewById(R.id.button_add_coxswain);
        addCoxswainBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                addCoxswainDisplay();
            }
        });

        // Add Another Rower Button
        Button addAnotherRowerBtn = (Button) findViewById(R.id.button_add_another_rower);
        addAnotherRowerBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // add  another coxswain
            }
        });

        // Add Another Rower Button
        Button addAnotherCoxswainBtn = (Button) findViewById(R.id.button_add_another_coxswain);
        addAnotherCoxswainBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // add  another coxswain
            }
        });

        // submit button listener
        Button submitBtn = (Button) findViewById(R.id.button_submit);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                homeScreen();
                // save coach information
                //
            }
        });

    }

    public void homeScreen() {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }

    public void addRowerDisplay() {

        //TextView views
        TextView fnameTxt = (TextView) findViewById(R.id.textView_rower_fname);
        fnameTxt.setVisibility(View.VISIBLE);
        TextView lnameTxt = (TextView) findViewById(R.id.textView_rower_lname);
        lnameTxt.setVisibility(View.VISIBLE);
        TextView weightTxt = (TextView) findViewById(R.id.textView_rower_weight);
        weightTxt.setVisibility(View.VISIBLE);
        TextView twoktimeTxt = (TextView) findViewById(R.id.textView_twok_time);
        twoktimeTxt.setVisibility(View.VISIBLE);
        TextView sixktimeTxt = (TextView) findViewById(R.id.textView_sixk_time);
        sixktimeTxt.setVisibility(View.VISIBLE);

        //EditText views
        EditText fnameIn = (EditText) findViewById(R.id.editText_rower_fname);
        fnameIn.setVisibility(View.VISIBLE);
        EditText lnameIn = (EditText) findViewById(R.id.editText_rower_lname);
        lnameIn.setVisibility(View.VISIBLE);
        EditText weightIn = (EditText) findViewById(R.id.editText_rower_weight);
        weightIn.setVisibility(View.VISIBLE);
        EditText twokIn = (EditText) findViewById(R.id.editText_twok_time);
        twokIn.setVisibility(View.VISIBLE);
        EditText sixkIn = (EditText) findViewById(R.id.editText_sixk_time);
        sixkIn.setVisibility(View.VISIBLE);
    }

    public void addCoxswainDisplay() {
        //TextView views
        TextView fnameTxt = (TextView) findViewById(R.id.textView_coxswain_fname);
        fnameTxt.setVisibility(View.VISIBLE);
        TextView lnameTxt = (TextView) findViewById(R.id.textView_coxswain_lname);
        lnameTxt.setVisibility(View.VISIBLE);
        TextView weightTxt = (TextView) findViewById(R.id.textView_coxswain_weight);
        weightTxt.setVisibility(View.VISIBLE);

        //EditText views
        EditText fnameIn = (EditText) findViewById(R.id.editText_coxswain_fname);
        fnameIn.setVisibility(View.VISIBLE);
        EditText lnameIn = (EditText) findViewById(R.id.editText_coxswain_lname);
        lnameIn.setVisibility(View.VISIBLE);
        EditText weightIn = (EditText) findViewById(R.id.editText_coxswain_weight);
        weightIn.setVisibility(View.VISIBLE);


    }
}





