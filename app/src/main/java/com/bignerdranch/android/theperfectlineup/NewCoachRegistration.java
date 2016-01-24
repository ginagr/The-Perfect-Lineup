package com.bignerdranch.android.theperfectlineup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewCoachRegistration extends AppCompatActivity implements View.OnClickListener {
    private Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_coach_registration);
        submitBtn = (Button) findViewById(R.id.button_submit);
        submitRegButton.setOnClickListener(new View.OnClickListener()) {
            public void onClick(View v) {
               /* Intent i = new Intent();
                i.setComponent(new ComponentName("com.android.contacts", "com.android.contacts.DialtactsContactsEntryActivity"));
                i.setAction("android.intent.action.MAIN");
                i.addCategory("android.intent.category.LAUNCHER");
                i.addCategory("android.intent.category.DEFAULT");
                v.getContext().startActivity(i);*/
                setContentView(R.layout.activity_login);
            }

        }
    }
}
   /* public void onClick(View view) {
        Intent myIntent = new Intent(this, LoginActivity.class);
        startActivity(myIntent);
    }
    */


    /*
    buttonItem.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        i.setComponent(new ComponentName("com.android.contacts", "com.android.contacts.DialtactsContactsEntryActivity"));
        i.setAction("android.intent.action.MAIN");
        i.addCategory("android.intent.category.LAUNCHER");
        i.addCategory("android.intent.category.DEFAULT");
        v.getContext().startActivity(i);
    }

     */


