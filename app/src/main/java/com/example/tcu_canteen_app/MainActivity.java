package com.example.tcu_canteen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.learnandroid.loginsqlite.DBHelper;

public class MainActivity extends AppCompatActivity {

    EditText inputemail, inputpassword, repassword;
    Button loginbutton, signuppagebutton, viewbtn;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputemail = (EditText) findViewById(R.id.inputemail);
        inputpassword = (EditText) findViewById(R.id.inputpassword);
        repassword = (EditText) findViewById(R.id.repassword);
        signuppagebutton = (Button) findViewById(R.id.signuppagebutton);
        loginbutton = (Button) findViewById(R.id.loginbutton);
        viewbtn = (Button) findViewById(R.id.viewbtn);
        DB = new DBHelper(this);

        signuppagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = inputemail.getText().toString();
                String pass = inputpassword.getText().toString();
                String repass = repassword.getText().toString();

                if(user.equals("")|| pass.equals("")|| repass.equals(""))
                    Toast.makeText(MainActivity.this, "Enter All Fields", Toast.LENGTH_SHORT).show();
                else {
                    if(pass.equals(repass)) {
                        Boolean checkuser = DB.checkusername(user);
                        if(checkuser==false) {
                            Boolean insert = DB.insertData(user, pass);
                            if(insert==true) {
                                Toast.makeText(MainActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), SignUpMainActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(MainActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(MainActivity.this, "User Already Exists, Please Sign In", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Passwords Not Matching", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(intent);
            }
        });

        viewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTandCactivity();
            }
        });
    }

    public void openTandCactivity(){
        Intent intent = new Intent(this, TandCactivity.class);
        startActivity(intent);
    }
}