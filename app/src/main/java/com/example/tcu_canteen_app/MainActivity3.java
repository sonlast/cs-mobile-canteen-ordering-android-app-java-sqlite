package com.example.tcu_canteen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButtonToggleGroup;
import com.learnandroid.loginsqlite.DBHelper;

public class MainActivity3 extends AppCompatActivity {

    EditText inputemail3, inputpassword3;
    Button viewbtn3, loginbutton3;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        inputemail3 = (EditText) findViewById(R.id.inputemail3);
        inputpassword3 = (EditText)  findViewById(R.id.inputpassword3);
        loginbutton3 = (Button) findViewById(R.id.loginbutton3);
        DB = new DBHelper(this);

        loginbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = inputemail3.getText().toString();
                String pass = inputpassword3.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(MainActivity3.this, "Please Enter all fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass = DB.checkusernamepassword(user, pass);
                    if(checkuserpass==true) {
                        Toast.makeText(MainActivity3.this, "Sign In Successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), SignUpMainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity3.this, "User Doesn't Exist", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        viewbtn3 = (Button) findViewById(R.id.viewbtn3);
        viewbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openTandCactivity3(); }
        });
    }

    public void openTandCactivity3() {
        Intent intent = new Intent(this, TandCactivity3.class);
        startActivity(intent);
    }
}