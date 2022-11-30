package com.example.facebooktest.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.facebooktest.R;

public class LoginFacebook extends AppCompatActivity {
    EditText userName , Password ;
    Button login , createNewAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_facebook);
        setUi ();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check();
            }
        });
        createNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(LoginFacebook.this , CreateNewAccount.class);
                startActivity(intent);
                finish();
            }
        });

    }
    private void setUi() {
        userName = findViewById(R.id.phone);
        Password = findViewById(R.id.password);
        login = findViewById(R.id.login_btn);
        createNewAccount = findViewById(R.id.create_new);
    }

    private void check (){
        if (userName.getText().toString().isEmpty()){
            Toast.makeText(this,getString(R.string.enterName),Toast.LENGTH_LONG).show();
            return;
        }
        if (Password.getText().toString().isEmpty()){
            Toast.makeText(this,getString(R.string.enterPassword),Toast.LENGTH_LONG).show();
            return;
        }
        if (userName.getText().toString().equals("Mai") && Password.getText().toString().equals("1234")){
            Toast.makeText(this,getString(R.string.welcome),Toast.LENGTH_LONG).show();
            Intent intent= new Intent(this , HomePageFace2.class);
            startActivity(intent);
            finish();
        }
        else {
            Toast.makeText(this,"Error",Toast.LENGTH_LONG).show();
        }
    }
}