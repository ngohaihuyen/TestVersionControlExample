package com.example.projectexample;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    String value = "";

    AppCompatButton loginBtn;
    AppCompatTextView title;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.act_constrain_layout);
        loginBtn = findViewById(R.id.login_btn);
        title = findViewById(R.id.title_tv);
        loginBtn.setOnClickListener(this);

        Log.d("ManhNQ", "onCreate: "+value);
        try {
            String titleValue = savedInstanceState.getString("KEY_TITLE");
            if(titleValue!=null){
                title.setText(titleValue);
            }
        }catch (Exception e){

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ManhNQ", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ManhNQ", "onResume: "+ value);
        value = "hello";
        Log.d("ManhNQ", "onResume: "+value);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ManhNQ", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ManhNQ", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ManhNQ", "onDestroy: ");
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.login_btn){
            value = "Hello World";
            title.setText(value);
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("ManhNQ", "onSaveInstanceState: ");
        outState.putString("Key title",value);
    }
}
