package com.example.s528761.slicefood;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EmployeeLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_login);

        //Image for user login
        EditText userEdit = (EditText) findViewById(R.id.userET);
        EditText userPwd = (EditText) findViewById(R.id.userPwdET);
        Drawable userImg = getResources().getDrawable(R.drawable.useret);
        Drawable userPwdImg = getResources().getDrawable(R.drawable.locket);
        userImg.setBounds(0, 0, 65, 65);
        userPwdImg.setBounds(0, 0, 60, 60);
        userEdit.setCompoundDrawables(userImg, null, null, null);
        userPwd.setCompoundDrawables(userPwdImg, null, null, null);
    }

        //Navigating to signup page
    public  void signUp(View v){
       // TextView signTV = (TextView)findViewById(R.id.signUpTV);
        Intent intent = new Intent(this,SignUp.class );
        startActivity(intent);

    }
        //navigating to main menu
    public void loginBT(View v){
        Intent intent = new Intent(this,MainMenu.class );
        startActivity(intent);
    }
    //navigating to Start
    public void slice(View v){
        Intent intent = new Intent(this,MainActivity.class );
        startActivity(intent);
    }


    }
