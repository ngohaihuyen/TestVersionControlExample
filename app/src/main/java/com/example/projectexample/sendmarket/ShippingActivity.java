package com.example.projectexample.sendmarket;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.projectexample.R;

public class ShippingActivity extends AppCompatActivity implements View.OnClickListener {

     private AppCompatButton shipButton;
     private AppCompatTextView titletxt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_shipping_layout);

        shipButton = findViewById(R.id.ship_bt);
        titletxt = findViewById(R.id.market_txt);

        shipButton.setOnClickListener(this);
        titletxt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.ship_bt){
            Market market = new Market ("Apple", 10);
            Intent intent = new Intent (this.getApplicationContext(), Receive.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("KEY_MARKET", market);
            intent.putExtra("KEY_BUNDLE_MARKET", bundle);
            startActivity(intent);
        } else if (v.getId() == R.id.market_txt) {
            Log.d("ManhNQ", "onClick: shipping text");
        }
    }
}
