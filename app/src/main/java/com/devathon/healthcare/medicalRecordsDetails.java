package com.devathon.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class medicalRecordsDetails extends AppCompatActivity {

    TextView MRDDatetextView,MRDcomptextView,MRDdurtextView,MRDtreattextView,MRDdateTreattextView,MRDdocTreattextView,MRDhosTreattextView,MRDDischatextView,MRDfoluptextView,MRDCLICKHERE;
    Button MRDDetailsButton,MRDDetailsButton2;
    EditText MRDIDeditText,MRDrecIDeditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_records_details);

        MRDDatetextView = (TextView) findViewById(R.id.MRDDatetextView);
        MRDcomptextView = (TextView) findViewById(R.id.MRDcomptextView);
        MRDdurtextView = (TextView) findViewById(R.id.MRDdurtextView);
        MRDtreattextView = (TextView) findViewById(R.id.MRDtreattextView);
        MRDdateTreattextView = (TextView) findViewById(R.id.MRDdateTreattextView);
        MRDdocTreattextView = (TextView) findViewById(R.id.MRDdocTreattextView);
        MRDhosTreattextView = (TextView) findViewById(R.id.MRDhosTreattextView);
        MRDDischatextView = (TextView) findViewById(R.id.MRDDischatextView);
        MRDfoluptextView = (TextView) findViewById(R.id.MRDfoluptextView);
        MRDCLICKHERE = (TextView) findViewById(R.id.MRDCLICKHERE);
        MRDIDeditText = (EditText) findViewById(R.id.MRDIDeditText);
        MRDrecIDeditText = (EditText) findViewById(R.id.MRDrecIDeditText);
        MRDDetailsButton = (Button) findViewById(R.id.MRDDetailsButton);
        MRDDetailsButton2 = (Button) findViewById(R.id.MRDDetailsButton2);
    }
}