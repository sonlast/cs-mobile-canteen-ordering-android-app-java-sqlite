package com.example.tcu_canteen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpMainActivity extends AppCompatActivity {

    Button stall1, stall2, stall3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_main);

        stall1 = (Button) findViewById(R.id.stall1);
        stall2 = (Button) findViewById(R.id.stall2);
        stall3 = (Button) findViewById(R.id.stall3);

        stall1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStall1Activity();
            }
        });

        stall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStall2Activity();
            }
        });

        stall3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStall3Activity();
            }
        });
    }

    public void openStall1Activity() {
        Intent intent = new Intent(this, Stall1Activity.class);
        startActivity(intent);
    }

    public void openStall2Activity() {
        Intent intent = new Intent(this, Stall2Activity.class);
        startActivity(intent);
    }

    public void openStall3Activity() {
        Intent intent = new Intent(this, Stall3Activity.class);
        startActivity(intent);
    }
}