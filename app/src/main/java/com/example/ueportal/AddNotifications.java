package com.example.ueportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AddNotifications extends AppCompatActivity {
    EditText etNotificationTitle, etDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_notifications);

        viewAll();
    }

    private void viewAll() {
        etNotificationTitle = findViewById(R.id.etNotificationTitle);
        etDetail = findViewById(R.id.etDetail);
    }
}
