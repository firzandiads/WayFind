package com.example.wayfind;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class PilihKendaraan extends AppCompatActivity {

    private Button buttonBus;
    private Button buttonMobil;
    private Button buttonMotor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_kendaraan);

        buttonBus = findViewById(R.id.buttonBus);
        buttonMobil = findViewById(R.id.buttonMobil);
        buttonMotor = findViewById(R.id.buttonMotor);

        buttonBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode untuk pindah ke halaman BUS
                Intent intent = new Intent(PilihKendaraan.this, Bus.class);
                startActivity(intent);
            }
        });

        buttonMobil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode untuk pindah ke halaman Mobil
                Intent intent = new Intent(PilihKendaraan.this, RuteMobil.class);
                startActivity(intent);
            }
        });

        buttonMotor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode untuk pindah ke halaman Motor
                Intent intent = new Intent(PilihKendaraan.this, RuteMotor.class);
                startActivity(intent);
            }
        });
    }
}