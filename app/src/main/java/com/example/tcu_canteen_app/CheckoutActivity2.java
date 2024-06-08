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

public class CheckoutActivity2 extends AppCompatActivity {

    ImageView copylogo2;
    TextView gcashnumber2;
    Button confirmation2, reservatiobtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout2);

        copylogo2 = (ImageView) findViewById(R.id.copylogo2);
        gcashnumber2 = (TextView) findViewById(R.id.gcashnumber2);
        confirmation2 = (Button) findViewById(R.id.confirmation2);
        reservatiobtn2 = (Button) findViewById(R.id.reservatiobtn2);

        copylogo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboardManager = (ClipboardManager)  getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Copy", gcashnumber2.getText().toString());
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(CheckoutActivity2.this, "Copied to Clipboard", Toast.LENGTH_SHORT).show();
            }
        });

        confirmation2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStall2Activity();
            }
        });

        reservatiobtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStall2ActivityII();
            }
        });
    }

    public void openStall2Activity() {
        Intent intent = new Intent(this, Stall2Activity.class);
        Toast.makeText(this, "Order Confirmed With G-Cash", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    public void openStall2ActivityII() {
        Intent intent = new Intent(this, Stall2Activity.class);
        Toast.makeText(this, "Order Reserved", Toast.LENGTH_SHORT).show();
        finish();
        startActivity(intent);
    }
}