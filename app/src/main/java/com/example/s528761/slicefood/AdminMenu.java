package com.example.s528761.slicefood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AdminMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu);
    }
    //navigating to home page
    public void logoutBT(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    //navigating to Schedule
    public void scAD(View v){
        Intent intent = new Intent(this, AdminSchedule.class);
        startActivity(intent);
    }
    //navigating to admin menu
    public void trackBT(View v){
        Intent intent = new Intent(this, TrackLocation.class);
        startActivity(intent);
    }
}
