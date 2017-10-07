package com.example.s528761.slicefood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AdminSchedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_schedule);
    }
    //navigating to menu
    public void menuBTAd(View v){
        Intent intent = new Intent(this, AdminMenu.class);
        startActivity(intent);
    }
}
