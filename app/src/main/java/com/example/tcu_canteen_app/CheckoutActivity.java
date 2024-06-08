package com.example.tcu_canteen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CheckoutActivity extends AppCompatActivity {

    ImageView copylogo;
    TextView gcashnumber;
    Button confirmation, reservatiobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        copylogo = (ImageView) findViewById(R.id.copylogo);
        gcashnumber = (TextView) findViewById(R.id.gcashnumber);
        confirmation = (Button) findViewById(R.id.confirmation);
        reservatiobtn = (Button) findViewById(R.id.reservatiobtn);

        copylogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboardManager = (ClipboardManager)  getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Copy", gcashnumber.getText().toString());
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(CheckoutActivity.this, "Copied to Clipboard", Toast.LENGTH_SHORT).show();
            }
        });

        confirmation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStall1Activity();
            }
        });

        reservatiobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStall1ActivityII();
            }
        });
    }

    public void openStall1Activity() {
        Intent intent = new Intent(this, Stall1Activity.class);
        Toast.makeText(this, "Order Confirmed With G-Cash", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    public void openStall1ActivityII() {
        Intent intent = new Intent(this, Stall1Activity.class);
        Toast.makeText(this, "Order Reserved", Toast.LENGTH_SHORT).show();
        finish();
        startActivity(intent);
    }
}