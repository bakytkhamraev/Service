package com.geektech.service;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.geektech.data.NotificationHelper;

public class MainActivity extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupView();
        setupListener();
    }

    private void setupListener() {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationHelper.CreateNatification(getApplicationContext());
            }
        });

    }

    private void setupView() {
        button=findViewById(R.id.btnNotification);

    }
}
