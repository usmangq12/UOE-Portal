package com.example.ueportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AddStudent extends AppCompatActivity {

    TextView tvAddStudent;
    EditText etFirstName, etLastName, etRollNumber, etEmailAddress, etAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        allViews();
    }

    private void allViews(){
//        tvAddStudent = findViewById(R.id.tvAddStudent);
//
//        etFirstName = findViewById(R.id.etFirstName);
//        etLastName = findViewById(R.id.etLastName);
//        etRollNumber = findViewById(R.id.etRollNumber);
//        etEmailAddress = findViewById(R.id.etEmailAddress);
//        etAddress = findViewById(R.id.etAddress);
    }


}
