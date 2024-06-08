package com.example.tcu_canteen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.learnandroid.loginsqlite.DBHelper;


public class Main2Activity extends AppCompatActivity {

    Button loginbutton2, signuppagebutton2, viewbtn2;
    EditText inputemail2, inputpassword2, repassword2;
    DBHelper DB;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        inputemail2 = (EditText) findViewById(R.id.inputemail2);
        inputpassword2 = (EditText) findViewById(R.id.inputpassword2);
        repassword2 = (EditText) findViewById(R.id.repassword2);
        signuppagebutton2 = (Button) findViewById(R.id.signuppagebutton2);
        loginbutton2 = (Button) findViewById(R.id.loginbutton2);
        viewbtn2 = (Button) findViewById(R.id.viewbtn2);
        DB = new DBHelper(this);

        signuppagebutton2 = (Button) findViewById(R.id.signuppagebutton2);
        signuppagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = inputemail2.getText().toString();
                String pass = inputpassword2.getText().toString();
                String repass = repassword2.getText().toString();

                if(user.equals("")|| pass.equals("")|| repass.equals(""))
                    Toast.makeText(Main2Activity.this, "Enter All Fields", Toast.LENGTH_SHORT).show();
                else {
                    if(pass.equals(repass)) {
                        Boolean checkuser = DB.checkusername(user);
                        if(checkuser==false) {
                            Boolean insert = DB.insertData(user, pass);
                            if(insert==true) {
                                Toast.makeText(Main2Activity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), SellerSignUpActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(Main2Activity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(Main2Activity.this, "User Already Exists, Please Sign In", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(Main2Activity.this, "Passwords Not Matching", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        loginbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openMainActivity4(); }
        });

        viewbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTandCactivity2();
            }
        });
    }

    public void openTandCactivity2(){
        Intent intent = new Intent(this, TandCactivity2.class);
        startActivity(intent);
    }

    public void openMainActivity4(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}