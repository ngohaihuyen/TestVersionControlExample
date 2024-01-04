package com.example.projectexample.receive;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.projectexample.R;

public class SendActivity extends AppCompatActivity implements View.OnClickListener {

    private AppCompatButton sendButton;
    private AppCompatTextView titleTv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_layout);

        sendButton = findViewById(R.id.send_btn);
        titleTv = findViewById(R.id.title_txt);

        sendButton.setOnClickListener(this);
        titleTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.send_btn) {
            Student student = new Student("Manh ngo", 10);

            Intent intent = new Intent(this.getApplicationContext(), ReceiveActivity.class);
            intent.putExtra("key_hello", "hello chao cac ban");

            Bundle bundle = new Bundle();
            bundle.putSerializable("KEY_STUDENT", student);
            intent.putExtra("KEY_BUNDLE_STUDENT", bundle);

            startActivity(intent);

        } else if (v.getId() == R.id.title_txt) {
            Log.d("ManhNQ", "onClick: send title text click");
        }
    }
}
