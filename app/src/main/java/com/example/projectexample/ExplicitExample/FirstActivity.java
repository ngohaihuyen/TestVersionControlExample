package com.example.projectexample.ExplicitExample;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.projectexample.R;

public class FirstActivity extends AppCompatActivity {

    AppCompatButton signupBt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_firstscreen_explicit_layout);
        signupBt = findViewById(R.id.signup_btn);

        signupBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);

//                Intent intent = new Intent();
//                intent.setAction("action_custom");
//                startActivity(intent);
            }
        });
    }
}
