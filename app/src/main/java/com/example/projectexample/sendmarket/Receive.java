package com.example.projectexample.sendmarket;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.projectexample.R;

public class Receive extends AppCompatActivity {

    AppCompatTextView titletxt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_receive_layout);
        titletxt = findViewById(R.id.market_tv);

        Intent intent = getIntent();
        Bundle valueBundle = intent.getBundleExtra("KEY_BUNDLE_MARKET");
        Market market = (Market) valueBundle.getSerializable("KEY_MARKET");

        Log.d("ManhNQ", "onCreate: "+ toString());
        titletxt.setText("Market shipping: "+market.getQuantity()+" kg "+ market.getFood());
    }
}
