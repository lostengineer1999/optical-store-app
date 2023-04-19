package com.example.optical_store.activities;

import static com.example.optical_store.R.id.*;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.optical_store.R;

public class PaymentActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextView subTotal,discount,shipping,total;
        @Override
    protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_payment);

            //Toolbar
            toolbar = findViewById(R.id.payment_toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();

                }
            });

            double amount = 0.0;
            amount = getIntent().getDoubleExtra("amount",0.0);


            subTotal =findViewById(R.id.sub_total);
            discount = findViewById(R.id.textView17);
            shipping = findViewById(R.id.textView18);
            total = findViewById(R.id.total_amt);

            subTotal.setText(amount+"$");


        }
}
