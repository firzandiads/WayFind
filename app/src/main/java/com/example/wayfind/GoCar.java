package com.example.wayfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GoCar extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_car);
    }

    public void openApp(View view) {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.gojek.app");

        if(launchIntent != null){
            startActivity(launchIntent);
        }else {
            Toast.makeText(GoCar.this, "Aplikasi Belum Terinstal", Toast.LENGTH_LONG).show();
        }
    }
}