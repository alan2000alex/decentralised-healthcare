package com.devathon.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DoctorDetails extends AppCompatActivity {

    EditText docDelEdittext;
    TextView DocDelNametextView,DocDelAddetextView,DocDelSpectextView,DocDelNumtextView;
    Button DocDelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        docDelEdittext = (EditText) findViewById(R.id.docDelEdittext);
        DocDelNametextView = (TextView) findViewById(R.id.DocDelNametextView);
        DocDelAddetextView = (TextView) findViewById(R.id.DocDelAddetextView);
        DocDelSpectextView = (TextView) findViewById(R.id.DocDelSpectextView);
        DocDelNumtextView = (TextView) findViewById(R.id.DocDelNumtextView);
        DocDelButton = (Button) findViewById(R.id.DocDelButton);

    }
}