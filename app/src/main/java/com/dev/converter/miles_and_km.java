package com.dev.converter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import java.text.DecimalFormat;

public class miles_and_km extends Activity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.miles_and_km);
        Button buttonConvMilesToKm = (Button)findViewById(R.id.buttonConvMilesToKm);
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKm = (EditText) findViewById(R.id.editTextKm);
                double vMiles = Double.parseDouble(textBoxMiles.getText().toString());
                double vKm = vMiles/0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxKm.setText(formatVal.format(vKm));

            }
        });
        Button buttonConvKmToMiles = (Button)findViewById(R.id.buttonConvKmToMiles);
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKm = (EditText) findViewById(R.id.editTextKm);
                double vKm = Double.parseDouble(textBoxKm.getText().toString());
                double vMiles = vKm*0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxMiles.setText(formatVal.format(vMiles));
            }
        });



        }
}
