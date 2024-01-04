package com.example.projectexample.implicitexample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.projectexample.R;

public class ImplicitExample extends AppCompatActivity {
    AppCompatButton helloBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_implicit_layout);
        helloBtn = findViewById(R.id.hello_btn);

        helloBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.instagram.com/oddatelier/"));
                startActivity(intent);
            }
        });

    }
}
