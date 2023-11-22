package com.example.wayfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class Mobil extends AppCompatActivity {

    private FrameLayout gocar;
    private FrameLayout grabcar;
    private FrameLayout maximcar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobil);

        gocar = findViewById(R.id.gocar);
        grabcar = findViewById(R.id.grabcar);
        maximcar = findViewById(R.id.maximcar);

        gocar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode untuk pindah ke halaman BUS
                Intent intent = new Intent(Mobil.this, GoCar.class);
                startActivity(intent);
            }
        });

        grabcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode untuk pindah ke halaman BUS
                Intent intent = new Intent(Mobil.this, GrabCar.class);
                startActivity(intent);
            }
        });

        maximcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode untuk pindah ke halaman BUS
                Intent intent = new Intent(Mobil.this, MaximCar.class);
                startActivity(intent);
            }
        });


    }
}