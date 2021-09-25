package com.devathon.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class patientMedicalRecord extends AppCompatActivity {

    EditText RecIdEditText,recDateEditText,recordIDeditText,recCompeditText,recDureditText,recordTSIDeditText,recTSDateeditText,recTSDocIDeditText,recTSHosIDeditText,recTSDiseditText,recTSFoleditText;
    Button recSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_medical_record);

        RecIdEditText = (EditText) findViewById(R.id.RecIdEditText);
        recDateEditText = (EditText) findViewById(R.id.recDateEditText);
        recordIDeditText = (EditText) findViewById(R.id.recordIDeditText);
        recCompeditText = (EditText) findViewById(R.id.recCompeditText);
        recDureditText = (EditText) findViewById(R.id.recDureditText);
        recordTSIDeditText = (EditText) findViewById(R.id.recordTSIDeditText);
        recTSDateeditText = (EditText) findViewById(R.id.recTSDateeditText);
        recTSDocIDeditText = (EditText) findViewById(R.id.recTSDocIDeditText);
        recTSHosIDeditText = (EditText) findViewById(R.id.recTSHosIDeditText);
        recTSDiseditText = (EditText) findViewById(R.id.recTSDiseditText);
        recTSFoleditText = (EditText) findViewById(R.id.recTSFoleditText);
        recSubmitButton = (Button) findViewById(R.id.recSubmitButton);

    }
}