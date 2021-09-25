package com.devathon.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PatientDetails extends AppCompatActivity {

    EditText patDelIDeditText;
    TextView patNametextView,patAddetextView,patMailtextView,patNumetextView,patDatetextView,patAgeetextView,patGentextView,patHeitextView,patWeitextView,attNametextView,attReltextView,attNumtextView;
    Button patDelbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_details);

        patDelIDeditText = (EditText) findViewById(R.id.patDelIDeditText);
        patNametextView = (TextView) findViewById(R.id.patNametextView);
        patAddetextView = (TextView) findViewById(R.id.patAddetextView);
        patMailtextView = (TextView) findViewById(R.id.patMailtextView);
        patNumetextView = (TextView) findViewById(R.id.patNumetextView);
        patDatetextView = (TextView) findViewById(R.id.patDatetextView);
        patAgeetextView = (TextView) findViewById(R.id.patAgeetextView);
        patGentextView = (TextView) findViewById(R.id.patGentextView);
        patHeitextView = (TextView) findViewById(R.id.patHeitextView);
        patWeitextView = (TextView) findViewById(R.id.patWeitextView);
        attNametextView = (TextView) findViewById(R.id.attNametextView);
        attReltextView = (TextView) findViewById(R.id.attReltextView);
        attNumtextView = (TextView) findViewById(R.id.attNumtextView);
        patDelbutton = (Button) findViewById(R.id.patDelbutton);
    }
}