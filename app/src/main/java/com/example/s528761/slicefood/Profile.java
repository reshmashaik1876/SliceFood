package com.example.s528761.slicefood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    //navigating to profile
    public void proBackBT(View v){
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
}
