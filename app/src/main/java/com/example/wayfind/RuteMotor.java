package com.example.wayfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RuteMotor extends AppCompatActivity {

    private Button buttonRuteMotor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rute_mobil);

        buttonRuteMotor = findViewById(R.id.buttonRuteMobil);

        buttonRuteMotor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode untuk pindah ke halaman Mobil
                Intent intent = new Intent(RuteMotor.this, Motor.class);
                startActivity(intent);
            }
        });
    }
}