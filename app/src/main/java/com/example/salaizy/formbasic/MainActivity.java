package com.example.salaizy.formbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox cbStatus;
    RadioButton rbMale;
    RadioButton rbFemale;
    Switch swGrade;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbStatus = (CheckBox ) findViewById(R.id.cbStatus);
        rbMale = (RadioButton) findViewById(R.id.rbMale);
        rbFemale = (RadioButton) findViewById(R.id.rbFemale);
        swGrade = (Switch) findViewById(R.id.swGrade);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }

    public void BuCheck(View view) {
        String Result = "";
        if(cbStatus.isChecked()) Result = " He is Married, ";
        else  Result = " He is not Married, ";

        if(rbMale.isChecked()) Result += " also he is a Male, ";
        else Result += " also she is a female, ";

        if(swGrade.isChecked()) Result += " also this is a student graduate , ";
        else Result += " also this is not a student graduate , ";

        tvResult.setText(Result);

    }
}
