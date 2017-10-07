package com.example.s528761.slicefood;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //For Spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinVal);
        String[] spin = new String[]{"Male", "Female", "Other"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, spin);
        spinner.setAdapter(adapter);
        //For user name and password
        EditText userEdit = (EditText) findViewById(R.id.username);
        EditText userPwd = (EditText)findViewById(R.id.pasWdET);
        Drawable adminImg = getResources().getDrawable(R.drawable.useret);
        Drawable adminPwdImg = getResources().getDrawable(R.drawable.locket);
        adminImg.setBounds(0,0,65,65);
        adminPwdImg.setBounds(0,0,60,60);
        userEdit.setCompoundDrawables(adminImg,null,null,null);
        userPwd.setCompoundDrawables(adminPwdImg,null,null,null);
    }
    //submit to main menu
    public void submit(View v){
        Toast.makeText(getApplicationContext(), "Successfully Registered",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, EmployeeLogin.class);
        startActivity(intent);
    }
    }

