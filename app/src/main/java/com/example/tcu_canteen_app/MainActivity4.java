package com.example.tcu_canteen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.learnandroid.loginsqlite.DBHelper;

public class MainActivity4 extends AppCompatActivity {

    EditText inputemail4, inputpassword4;
    Button viewbtn4, loginbutton4;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        inputemail4 = (EditText) findViewById(R.id.inputemail4);
        inputpassword4 = (EditText) findViewById(R.id.inputpassword4);
        loginbutton4 = (Button) findViewById(R.id.loginbutton4);
        DB = new DBHelper(this);

        loginbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = inputemail4.getText().toString();
                String pass = inputpassword4.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(MainActivity4.this, "Please Enter all fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass = DB.checkusernamepassword(user, pass);
                    if(checkuserpass==true) {
                        Toast.makeText(MainActivity4.this, "Sign In Successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), SellerSignUpActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity4.this, "User Doesn't Exist", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        viewbtn4 = (Button) findViewById(R.id.viewbtn4);
        viewbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openTandCactivity4(); }
        });
    }

    public void openTandCactivity4() {
        Intent intent = new Intent(this, TandCactivity4.class);
        startActivity(intent);
    }
}