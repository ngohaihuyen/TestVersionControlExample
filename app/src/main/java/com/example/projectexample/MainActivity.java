package com.example.projectexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int value = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Object oldValue = savedInstanceState.get("key_number");
//
//        if(oldValue!=null){
//            try {
//                value = (int) oldValue;
//            }catch (Exception e){
//
//            }
//        }
        boolean isClicked = true;


        setContentView(R.layout.act_constraint_layout_health);

        View viewTest = findViewById(R.id.search_bg);
        Drawable bgView = viewTest.getBackground();


//        value = 10;
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
//        outState.putInt("key_number", value);

    }
}