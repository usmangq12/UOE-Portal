package com.example.ueportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AddCourses extends AppCompatActivity {

    TextView tvAddCourses;
    EditText etCourseTitle, etFirstCourse, etSecondCourse, etThirdCourse, etFourthCourse, etFifthCourse, etSixthCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_courses);

        viewAll();
    }

    private void viewAll() {
        tvAddCourses = findViewById(R.id.tvAddCourses);
        etCourseTitle = findViewById(R.id.etCourseTitle);
        etFirstCourse = findViewById(R.id.etFirstCourse);
        etSecondCourse = findViewById(R.id.etSecondCourse);
        etThirdCourse = findViewById(R.id.etThirdCourse);
        etFourthCourse = findViewById(R.id.etFourthCourse);
        etFifthCourse = findViewById(R.id.etFifthCourse);
        etSixthCourse = findViewById(R.id.etSixthCourse);
    }
}
