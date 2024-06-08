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

public class CheckoutActivity3 extends AppCompatActivity {

    ImageView copylogo3;
    TextView gcashnumber3;
    Button confirmation3, reservatiobtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout3);

        copylogo3 = (ImageView) findViewById(R.id.copylogo3);
        gcashnumber3 = (TextView) findViewById(R.id.gcashnumber3);
        confirmation3 = (Button) findViewById(R.id.confirmation3);
        reservatiobtn3 = (Button) findViewById(R.id.reservatiobtn3);

        copylogo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboardManager = (ClipboardManager)  getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Copy", gcashnumber3.getText().toString());
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(CheckoutActivity3.this, "Copied to Clipboard", Toast.LENGTH_SHORT).show();
            }
        });

        confirmation3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStall3Activity();
            }
        });

        reservatiobtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStall3ActivityII();
            }
        });
    }

    public void openStall3Activity() {
        Intent intent = new Intent(this, Stall3Activity.class);
        Toast.makeText(this, "Order Confirmed with G-Cash", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    public void openStall3ActivityII() {
        Intent intent = new Intent(this, Stall3Activity.class);
        Toast.makeText(this, "Order Reserved", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}