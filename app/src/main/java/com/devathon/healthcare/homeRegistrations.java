package com.devathon.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class homeRegistrations extends AppCompatActivity {

    Button docRegButton,hosRegButton,patRegButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_registrations);

        docRegButton = (Button) findViewById(R.id.docRegButton);
        hosRegButton = (Button) findViewById(R.id.hosRegButton);
        patRegButton = (Button) findViewById(R.id.patRegButton);

    }
}