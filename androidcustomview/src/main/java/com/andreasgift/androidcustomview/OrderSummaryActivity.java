package com.andreasgift.androidcustomview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OrderSummaryActivity extends AppCompatActivity {
    private CustomView pickupTime;
    private CustomView pickupDate;
    private CustomView loadSize;
    private CustomView loadMethod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_summary);

        pickupDate = findViewById(R.id.pickup_date);
        pickupTime = findViewById(R.id.pickup_time);
        loadSize = findViewById(R.id.load_size);
        loadMethod = findViewById(R.id.load_method);

        pickupTime.setContentText("10.00 AM");
        pickupDate.setContentText("02/02/2019");
        loadSize.setContentText("5 Tonne");
        loadMethod.setContentText("Scrappe");
    }
}
