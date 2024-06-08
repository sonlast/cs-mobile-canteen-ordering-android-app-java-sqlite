package com.example.tcu_canteen_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Stall2Activity extends AppCompatActivity {

    Button btnplaceorder1, btnplaceorder2, btnplaceorder3, btnplaceorder4, btnplaceorder5,
            btnplaceorder6, btnplaceorder7, btnplaceorder8, btnplaceorder9, btnplaceorder10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stall2);

        btnplaceorder1 = (Button) findViewById(R.id.btnplaceorder1);
        btnplaceorder2 = (Button) findViewById(R.id.btnplaceorder2);
        btnplaceorder3 = (Button) findViewById(R.id.btnplaceorder3);
        btnplaceorder4 = (Button) findViewById(R.id.btnplaceorder4);
        btnplaceorder5 = (Button) findViewById(R.id.btnplaceorder5);
        btnplaceorder6 = (Button) findViewById(R.id.btnplaceorder6);
        btnplaceorder7 = (Button) findViewById(R.id.btnplaceorder7);
        btnplaceorder8 = (Button) findViewById(R.id.btnplaceorder8);
        btnplaceorder9 = (Button) findViewById(R.id.btnplaceorder9);
        btnplaceorder10 = (Button) findViewById(R.id.btnplaceorder10);

        btnplaceorder1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCheckoutActivity1();
            }
        });
        btnplaceorder2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCheckoutActivity2();
            }
        });
        btnplaceorder3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCheckoutActivity3();
            }
        });
        btnplaceorder4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCheckoutActivity4();
            }
        });
        btnplaceorder5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCheckoutActivity5();
            }
        });
        btnplaceorder6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCheckoutActivity6();
            }
        });
        btnplaceorder7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCheckoutActivity7();
            }
        });
        btnplaceorder8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCheckoutActivity8();
            }
        });
        btnplaceorder9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCheckoutActivity9();
            }
        });
        btnplaceorder10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCheckoutActivity10();
            }
        });
    }

    public void openCheckoutActivity1() {
        Intent intent = new Intent(this, CheckoutActivity2.class);
        Toast.makeText(this, "Order Placed", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    public void openCheckoutActivity2() {
        Intent intent = new Intent(this, CheckoutActivity2.class);
        Toast.makeText(this, "Order Placed", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    public void openCheckoutActivity3() {
        Intent intent = new Intent(this, CheckoutActivity2.class);
        Toast.makeText(this, "Order Placed", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    public void openCheckoutActivity4() {
        Intent intent = new Intent(this, CheckoutActivity2.class);
        Toast.makeText(this, "Order Placed", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    public void openCheckoutActivity5() {
        Intent intent = new Intent(this, CheckoutActivity2.class);
        Toast.makeText(this, "Order Placed", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    public void openCheckoutActivity6() {
        Intent intent = new Intent(this, CheckoutActivity2.class);
        Toast.makeText(this, "Order Placed", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    public void openCheckoutActivity7() {
        Intent intent = new Intent(this, CheckoutActivity2.class);
        Toast.makeText(this, "Order Placed", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    public void openCheckoutActivity8() {
        Intent intent = new Intent(this, CheckoutActivity2.class);
        Toast.makeText(this, "Order Placed", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    public void openCheckoutActivity9() {
        Intent intent = new Intent(this, CheckoutActivity2.class);
        Toast.makeText(this, "Order Placed", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
    public void openCheckoutActivity10() {
        Intent intent = new Intent(this, CheckoutActivity2.class);
        Toast.makeText(this, "Order Placed", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}