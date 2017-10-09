package com.example.s528761.slicefood;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton userIb = (ImageButton)findViewById(R.id.userImgBTN);
        ImageButton adminIb = (ImageButton)findViewById(R.id.adminImgBTN);
        //network connection
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if(networkInfo!=null && networkInfo.isConnected()){
            Toast.makeText(getApplicationContext(),"Network Connection successful",Toast.LENGTH_SHORT).show();

        }else{
            userIb.setEnabled(false);
            adminIb.setEnabled(false);
            Toast.makeText(getApplicationContext(),"Please check the network connection",Toast.LENGTH_LONG).show();
        }

    }

    //Navigating to admin login page
    public void adminImage(View v){
       // ImageButton adminImg = (ImageButton)findViewById(R.id.adminImgBTN);
        Intent intent = new Intent(this,AdminLogin.class);
        startActivity(intent);
    }

}
