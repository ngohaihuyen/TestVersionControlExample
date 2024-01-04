package com.example.projectexample.receive;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.projectexample.R;

public class ReceiveActivity extends AppCompatActivity {
    AppCompatTextView titleTv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_layout);


        Intent intent = getIntent();

        String helloValue = intent.getStringExtra("key_hello");

        Bundle valueBundle = intent.getBundleExtra("KEY_BUNDLE_STUDENT");
        Student student = (Student) valueBundle.getSerializable("KEY_STUDENT");

        Log.d("ManhNQ", "onCreate: "+student.toString());

        titleTv = findViewById(R.id.receive);
        titleTv.setText("student info:"+student.getName()+"&"+ student.getAge());

    }
}
