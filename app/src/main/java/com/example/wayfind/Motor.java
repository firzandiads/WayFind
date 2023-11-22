package com.example.wayfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class Motor extends AppCompatActivity {

    private FrameLayout goride;
    private FrameLayout grabbike;
    private FrameLayout maximbike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motor);

        goride = findViewById(R.id.goride);
        grabbike = findViewById(R.id.grabbike);
        maximbike = findViewById(R.id.maximbike);

        goride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode untuk pindah ke halaman BUS
                Intent intent = new Intent(Motor.this, GoRide.class);
                startActivity(intent);
            }
        });

        grabbike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode untuk pindah ke halaman BUS
                Intent intent = new Intent(Motor.this, GrabBike.class);
                startActivity(intent);
            }
        });

        maximbike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode untuk pindah ke halaman BUS
                Intent intent = new Intent(Motor.this, MaximBike.class);
                startActivity(intent);
            }
        });

    }
}