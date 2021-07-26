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

public class cm_in_ft extends Activity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cm_in_ft);

        Button button = (Button)findViewById(R.id.cm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxCm = (EditText) findViewById(R.id.editTextCm);
                EditText textBoxIn = (EditText) findViewById(R.id.editTextIn);
                EditText textBoxFt = (EditText) findViewById(R.id.editTextFt);
                double vCm = Double.parseDouble(textBoxCm.getText().toString());
                double vIn = vCm/2.54;
                double vFt = vCm/30.48;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxIn.setText(formatVal.format(vIn));
                textBoxFt.setText(formatVal.format(vFt));

            }
        });

        Button button1 = (Button)findViewById(R.id.in);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxCm = (EditText) findViewById(R.id.editTextCm);
                EditText textBoxIn = (EditText) findViewById(R.id.editTextIn);
                EditText textBoxFt = (EditText) findViewById(R.id.editTextFt);
                double vIn = Double.parseDouble(textBoxIn.getText().toString());
                double vCm = vIn*2.54;
                double vFt = vIn/12;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxCm.setText(formatVal.format(vCm));
                textBoxFt.setText(formatVal.format(vFt));

            }
        });

        Button button2 = (Button)findViewById(R.id.ft);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxCm = (EditText) findViewById(R.id.editTextCm);
                EditText textBoxIn = (EditText) findViewById(R.id.editTextIn);
                EditText textBoxFt = (EditText) findViewById(R.id.editTextFt);
                double vFt = Double.parseDouble(textBoxFt.getText().toString());
                double vIn = vFt*12;
                double vCm = vFt*30.48;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxIn.setText(formatVal.format(vIn));
                textBoxCm.setText(formatVal.format(vCm));

            }
        });
    }

}
