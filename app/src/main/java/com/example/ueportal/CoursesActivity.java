package com.example.ueportal;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class CoursesActivity extends AppCompatActivity {

    RecyclerView programmingList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        programmingList = findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] languages = {"BSIT", "BBA", "BS English", "BS Math", "BS Physics", "Education"};
        programmingList.setAdapter(new CommonAdapter(languages));

        }
    }


