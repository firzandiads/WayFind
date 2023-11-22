package com.example.wayfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RuteMobil extends AppCompatActivity {

    private Button buttonRuteMobil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rute_mobil);

        buttonRuteMobil = findViewById(R.id.buttonRuteMobil);

        buttonRuteMobil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode untuk pindah ke halaman Mobil
                Intent intent = new Intent(RuteMobil.this, Mobil.class);
                startActivity(intent);
            }
        });
    }
}