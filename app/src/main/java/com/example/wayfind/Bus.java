package com.example.wayfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Bus extends AppCompatActivity {

    private Button buttonBusCek;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

        buttonBusCek = findViewById(R.id.buttonBusCek);

        buttonBusCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode untuk pindah ke halaman BUS
                Intent intent = new Intent(Bus.this, BusHarga.class);
                startActivity(intent);
            }
        });


    }
}