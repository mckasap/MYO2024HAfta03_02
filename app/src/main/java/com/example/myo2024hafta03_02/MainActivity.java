package com.example.myo2024hafta03_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MCK","ON PAUSE METODU ÇALIŞTI");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MCK","ON RESUME METODU ÇALIŞTI");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MCK","ON START METODU ÇALIŞTI");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MCK","ON RESTART METODU ÇALIŞTI");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MCK","ON STOP METODU ÇALIŞTI");
    }

    @Override
    protected void onDestroy() {
        Log.i("MCK","ON DESTROY METODU ÇALIŞTI");
        super.onDestroy();
    }

    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=(ImageView) findViewById(R.id.imageView);
       try {
           iv.setImageURI((Uri) getIntent().getExtras().get(Intent.EXTRA_STREAM));
       }catch(Exception e)
       {

       }

        Log.i("MCK","ON CREATE METODU ÇALIŞTI");

    }
}