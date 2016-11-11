package com.mancng.activitydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView viewMessage;


    public void btnChangeActivity (View view) {

        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        viewMessage = (TextView) findViewById(R.id.viewMessage);

        Intent i = getIntent();

        viewMessage.setText("Hello " + i.getStringExtra("hello"));
        Log.i("Sent data", i.getStringExtra("hello"));

    }

}
