package com.example.demoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DemoActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities);

        Intent i = getIntent();
        String[] info = i.getStringArrayExtra("info");
        TextView textView = findViewById(R.id.textView);
        textView.setText("You are " + info[0] + ", age " + info[1]);
    }
}
