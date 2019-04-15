package com.example.ueportal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Notification extends AppCompatActivity {

    RecyclerView programmingList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        programmingList = findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] languages = {"Sports week is starting from 16 Feb", "Sports week is starting from 16 Feb",
                "Sports week is starting from 16 Feb", "Sports week is starting from 16 Feb",
                "Sports week is starting from 16 Feb", "Sports week is starting from 16 Feb"};
        programmingList.setAdapter(new CommonAdapter(languages));
    }
}
