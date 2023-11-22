package com.example.wayfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import android.widget.Toast;

public class BusHarga extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_harga);
    }

    public void openApp(View view) {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("ngi.transjogja.apppublic");

        if(launchIntent != null){
            startActivity(launchIntent);
        }else {
            Toast.makeText(BusHarga.this, "Aplikasi Belum Terinstal", Toast.LENGTH_LONG).show();
        }
    }
}