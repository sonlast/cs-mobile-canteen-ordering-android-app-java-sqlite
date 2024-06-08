package com.example.tcu_canteen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TandCactivity3 extends AppCompatActivity {

    Button agreement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tand_cactivity3);

        agreement = (Button) findViewById(R.id.agreement);
        agreement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openMainActivity3(); }
        });
    }

    public void openMainActivity3() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}