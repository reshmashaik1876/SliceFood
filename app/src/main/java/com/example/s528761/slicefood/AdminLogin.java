package com.example.s528761.slicefood;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AdminLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        //Image for Admin login
        EditText userEdit = (EditText) findViewById(R.id.adminET);
        EditText userPwd = (EditText)findViewById(R.id.adminPwET);
        Drawable adminImg = getResources().getDrawable(R.drawable.useret);
        Drawable adminPwdImg = getResources().getDrawable(R.drawable.locket);
        adminImg.setBounds(0,0,65,65);
        adminPwdImg.setBounds(0,0,60,60);
        userEdit.setCompoundDrawables(adminImg,null,null,null);
        userPwd.setCompoundDrawables(adminPwdImg,null,null,null);
    }
    public void loginAdBt(View v){
        Intent intent = new Intent(this,AdminMenu.class);
        startActivity(intent);
    }
}
