package com.example.ueportal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Admin extends AppCompatActivity {

    TextView tvAdmin;
    Button btnAddStudent, btnAddNotification, btnAddCourses, btnAddTimeTable;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        allViews();
        addStudent();
        addNotifications();
        addTimeTable();
        addCourses();
    }

    private void allViews(){
        tvAdmin = findViewById(R.id.tvAdmin);

        btnAddStudent = findViewById(R.id.btnAddStudent);
        btnAddNotification = findViewById(R.id.btnAddNotification);
        btnAddCourses = findViewById(R.id.btnAddCourses);
        btnAddTimeTable = findViewById(R.id.btnAddTimeTable);
    }

    private void addStudent(){
        btnAddStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Admin.this, AddStudent.class);
                startActivity(i);
            }
        });
    }

    private void addCourses() {
        btnAddCourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Admin.this, AddCourses.class);
                startActivity(i);
            }
        });
    }

    private void addTimeTable() {
        btnAddTimeTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Admin.this, AddTimeTable.class);
                startActivity(i);
            }
        });
    }
    // moving to the Add Notifications Activity
    private void addNotifications() {
        btnAddNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Admin.this, AddNotifications.class);
                startActivity(i);
            }
        });
    }
}
