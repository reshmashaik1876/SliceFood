package com.example.s528761.slicefood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    //Navigating to employee login page
    public void userImage(View v){
        ImageButton userImg = (ImageButton)findViewById(R.id.userImgBTN);
        Intent intent = new Intent(this,EmployeeLogin.class);
        startActivity(intent);
    }
    //Navigating to admin login page
    public void adminImage(View v){
       // ImageButton adminImg = (ImageButton)findViewById(R.id.adminImgBTN);
        Intent intent = new Intent(this,AdminLogin.class);
        startActivity(intent);
    }

}
