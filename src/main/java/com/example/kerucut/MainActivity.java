package com.example.kerucut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final double PI = 3.14; //menggunakan phi desimal
    private static  final double per = 0.333; //1/3 dibulatkan ke desimal berdasarkan rumus 1/3*phi*r*r*t
    private EditText edtJarijari, edtTinggi;
    private TextView txtVolume;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Hitung Volume Kerucut");

        edtJarijari =(EditText) findViewById(R.id.jarijari);
        edtTinggi = (EditText) findViewById(R.id.tinggi);
        btnHitung = (Button) findViewById(R.id.hitung);
        txtVolume = (TextView) findViewById(R.id.volume);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jarijari = edtJarijari.getText().toString().trim();
                String tinggi = edtTinggi.getText().toString().trim();

                double j = Double.parseDouble(jarijari);
                double t = Double.parseDouble(tinggi);

                double volume = per*PI*j*t;
                txtVolume.setText("Volume = " + volume);
            }
        });
    }
}
