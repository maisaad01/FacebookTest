package com.example.facebooktest.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.example.facebooktest.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SplashFacebook extends AppCompatActivity {
    FirebaseAuth auth ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_facebook);
        auth =FirebaseAuth.getInstance();

        new Handler()
                .postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(SplashFacebook.this,LoginFacebook.class);
                        startActivity(intent);
                        finish();
                    }
                },3000);

    }

//    private void signInAnonymously (){
//        auth.signInAnonymously()
//                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//                            Toast.makeText(SplashFacebook.this, "Success", Toast.LENGTH_SHORT).show();
//                            Intent intent = new Intent(SplashFacebook.this,HomePageFace2.class);
//                            startActivity(intent);
//                            finish();
//                        }
//
//                        else
//                            Toast.makeText(SplashFacebook.this, "Error", Toast.LENGTH_SHORT).show();
//                    }
//                });

//    }
}