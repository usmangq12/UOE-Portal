package com.example.ueportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class AddTimeTable extends AppCompatActivity {

    Button btnSelectImage;
    ImageView ivTimeTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_time_table);
        allViews();
    }
    private void allViews(){
        btnSelectImage = findViewById(R.id.btnSelectImage);
        ivTimeTable = findViewById(R.id.ivTimeTable);
    }
}
