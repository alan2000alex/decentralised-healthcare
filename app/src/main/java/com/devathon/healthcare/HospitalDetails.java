package com.devathon.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HospitalDetails extends AppCompatActivity {

    EditText hosDelIDeditText;
    TextView HosDelNameltextView,HosDelAddetextView,HosDelSpecetextView;
    Button HosDelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_details);

        hosDelIDeditText = (EditText) findViewById(R.id.hosDelIDeditText);
        HosDelNameltextView = (TextView) findViewById(R.id.HosDelNameltextView);
        HosDelAddetextView = (TextView) findViewById(R.id.HosDelAddetextView);
        HosDelSpecetextView = (TextView) findViewById(R.id.HosDelSpecetextView);
        HosDelButton = (Button) findViewById(R.id.HosDelButton);

    }
}