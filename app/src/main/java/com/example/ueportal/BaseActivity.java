package com.example.ueportal;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class BaseActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    CardView notificationsCV, applyOnlineCV, coursesCV, GPA_CalculatorCV, timeTableCV;

    //TextView blink_text;

    DrawerLayout drawer;
    ViewFlipper img_viewFlipper;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Array for Image ViewFlipper
        int[] images = {R.drawable.university1, R.drawable.university2, R.drawable.university3, R.drawable.university4};

        // for text blink code
        //blink();

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

     applyOnlineCV = findViewById(R.id.apply_img_id);
       //coursesCV = findViewById(R.id.cardView10);
     notificationsCV = findViewById(R.id.notification_img_id);
     timeTableCV = findViewById(R.id.time_img_id);
     GPA_CalculatorCV = findViewById(R.id.calculator_img_id);

     img_viewFlipper= findViewById(R.id.img_viewFlipper);

     //foreach for viewFlipper
     for(int image : images){
         image_viewFlipper(image);
        }

        //drawer
        drawerLayout();

        //onClick Listeners
        method_onClicks();


    }

    private void method_onClicks() {
        applyOnlineCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BaseActivity.this, ApplyOnline.class);
                startActivity(i);
            }
        });

        coursesCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BaseActivity.this, CoursesActivity.class);
                startActivity(i);
            }
        });

        notificationsCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BaseActivity.this, Notification.class);
                startActivity(i);
            }
        });

        timeTableCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BaseActivity.this, Time_Table_Activity.class);
                startActivity(i);
            }
        });

        GPA_CalculatorCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BaseActivity.this, GPA_Calculator.class);
                startActivity(i);
            }
        });
    }

    //method for drawer layout
    private void drawerLayout() {

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    //method for image view flipper
    public void image_viewFlipper(int image){
        ImageView imageView = new ImageView(BaseActivity.this);
        imageView.setBackgroundResource(image);

        img_viewFlipper.addView(imageView);
        img_viewFlipper.setFlipInterval(1000);
        img_viewFlipper.setAutoStart(true);

        //Animation for viewFlipper
        img_viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        img_viewFlipper.setInAnimation(this,android.R.anim.slide_out_right);

    }
    //private void blink(){
    //    final Handler handler = new Handler();
    //    new Thread(new Runnable() {
    //        @Override
    //        public void run() {
    //            int timetoblink = 1000;
    //            try{Thread.sleep(timetoblink);}
    //            catch (Exception e){}
    //            handler.post(new Runnable() {
    //                @Override
    //                public void run() {
    //                    blink_text = findViewById(R.id.blink_text);
    //                    if (blink_text.getVisibility() == View.VISIBLE){
    //                        blink_text.setVisibility(View.INVISIBLE);
    //                    }
    //                    else {
    //                        blink_text.setVisibility(View.VISIBLE);
    //                    }
    //                    blink();
    //                }
    //            });
    //        }
    //    }).start();
    //}

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

        final AlertDialog.Builder builder = new AlertDialog.Builder(BaseActivity.this);
        builder.setMessage("Do you want to exit?");
        builder.setCancelable(true);
        builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.setPositiveButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_dashboard) {

        } else if (id == R.id.nav_events) {

        } else if (id == R.id.nav_about) {

        } else if (id == R.id.nav_contact_us) {

        }else if (id == R.id.nav_our_website) {

        } else if (id == R.id.nav_logout) {

        }
        drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
