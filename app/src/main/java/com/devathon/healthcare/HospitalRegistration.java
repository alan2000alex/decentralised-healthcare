package com.devathon.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HospitalRegistration extends AppCompatActivity {
    EditText hosIDEditText,hosNameEditText,hosAddEditText,hosSpecEditText;
    TextView HosClickHere;
    Button Hospitalbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_registration);

        hosIDEditText = (EditText) findViewById(R.id.hosIDEditText);
        hosNameEditText = (EditText) findViewById(R.id.hosNameEditText);
        hosAddEditText = (EditText) findViewById(R.id.hosAddEditText);
        hosSpecEditText = (EditText) findViewById(R.id.hosSpecEditText);
        HosClickHere = (TextView) findViewById(R.id.HosClickHere);
        Hospitalbutton = (Button) findViewById(R.id.Hospitalbutton);

    }
}