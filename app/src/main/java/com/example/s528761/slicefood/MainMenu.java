package com.example.s528761.slicefood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
    //navigate to Employee login
    public void logoutBT(View v){
        Intent intent = new Intent(this, EmployeeLogin.class);
        startActivity(intent);
    }
    //Navigating to schedule
    public void scBT(View v){
        Intent intent = new Intent(this, Schedule.class);
        startActivity(intent);
    }
    //Navigating to profile
    public void profile(View v){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

}
