package com.devathon.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PatientRegistration extends AppCompatActivity {

    EditText patIDEditText,patNameEditText,patAddEditText,patNumEditText,patMailEditText,patAgeEditText,patGenEditText,patHeiEditText,patWeiEditText2,patIDEditText2,patNumEditText2,patAttEditText,patRelEditText;
    TextView PatientClickHere;
    Button Patientbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_registration);

        patIDEditText = (EditText) findViewById(R.id.patIDEditText);
        patNameEditText = (EditText) findViewById(R.id.patNameEditText);
        patAddEditText = (EditText) findViewById(R.id.patAddEditText);
        patNumEditText = (EditText) findViewById(R.id.patNumEditText);
        patMailEditText = (EditText) findViewById(R.id.patMailEditText);
        patAgeEditText = (EditText) findViewById(R.id.patAgeEditText);
        patGenEditText = (EditText) findViewById(R.id.patGenEditText);
        patHeiEditText = (EditText) findViewById(R.id.patHeiEditText);
        patWeiEditText2 = (EditText) findViewById(R.id.patWeiEditText2);
        patIDEditText2 = (EditText) findViewById(R.id.patIDEditText2);
        patAttEditText = (EditText) findViewById(R.id.patAttEditText);
        patNumEditText2 = (EditText) findViewById(R.id.patNumEditText2);
        patRelEditText = (EditText) findViewById(R.id.patRelEditText);
        PatientClickHere =(TextView) findViewById(R.id.PatientClickHere);
        Patientbutton =(Button) findViewById(R.id.Patientbutton);


    }
}