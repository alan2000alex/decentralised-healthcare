package com.devathon.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button RegButton,ViewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RegButton = (Button) findViewById(R.id.RegButton);
        ViewButton = (Button) findViewById(R.id.ViewButton);

    }
}