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

public class k_c_f extends Activity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.k_c_f);

        Button kel = (Button)findViewById(R.id.kelvin);
        kel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxK = (EditText) findViewById(R.id.editTextK);
                EditText textBoxC = (EditText) findViewById(R.id.editTextC);
                EditText textBoxF = (EditText) findViewById(R.id.editTextF);
                double vK = Double.parseDouble(textBoxK.getText().toString());
                double vC = vK-273.15;
                double vF = (vK-273.15)*1.8+32;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxC.setText(formatVal.format(vC));
                textBoxF.setText(formatVal.format(vF));

            }
        });

        Button cel = (Button)findViewById(R.id.celsius);
        cel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxK = (EditText) findViewById(R.id.editTextK);
                EditText textBoxC = (EditText) findViewById(R.id.editTextC);
                EditText textBoxF = (EditText) findViewById(R.id.editTextF);
                double vC = Double.parseDouble(textBoxC.getText().toString());
                double vK = vC+273.15;
                double vF = (vC*1.8)+32;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxK.setText(formatVal.format(vK));
                textBoxF.setText(formatVal.format(vF));

            }
        });

        Button fah = (Button)findViewById(R.id.fahrenheit);
        fah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxK = (EditText) findViewById(R.id.editTextK);
                EditText textBoxC = (EditText) findViewById(R.id.editTextC);
                EditText textBoxF = (EditText) findViewById(R.id.editTextF);
                double vF = Double.parseDouble(textBoxF.getText().toString());
                double vC = (vF-32)*0.5555;
                double vK = (vF-32)*0.5555+273.15;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxC.setText(formatVal.format(vC));
                textBoxK.setText(formatVal.format(vK));

            }
        });
    }
}
