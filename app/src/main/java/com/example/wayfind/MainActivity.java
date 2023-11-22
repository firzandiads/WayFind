package com.example.wayfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIMEOUT = 3000; // Durasi tampilan splash screen dalam milidetik (di sini, 3 detik)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mengatur penundaan dan memindahkan ke halaman selanjutnya
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LoginPage.class);
                startActivity(intent);
                finish(); // Mengakhiri aktivitas splash screen agar tidak dapat di
            }
        }, SPLASH_TIMEOUT);
    }
}
