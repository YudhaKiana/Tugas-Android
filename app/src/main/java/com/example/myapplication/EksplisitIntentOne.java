package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EksplisitIntentOne extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void newsScreen(View view) {
        Intent i = new Intent(getApplicationContext(), EksplisitIntentTwo.class);
        startActivity(i);
    }
}
