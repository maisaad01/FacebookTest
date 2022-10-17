package com.example.facebooktest.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.facebooktest.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class CreateNewAccount extends AppCompatActivity {
    EditText Email , Password ;
    Button signUp ;
    FirebaseAuth auth ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_acount);
        auth = FirebaseAuth.getInstance();
        unitUi ();
        checkUserLogin ();

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signWithEmailAndPassword (Email.getText().toString(),Password.getText().toString());
            }
        });
    }

    private void unitUi() {
        Email = findViewById(R.id.user_name_new_account);
        Password = findViewById(R.id.password_new_account);
        signUp = findViewById(R.id.signUp);
    }
    private void checkUserLogin (){
        FirebaseUser user = auth.getCurrentUser();
        if (user == null)
            Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Have Account", Toast.LENGTH_SHORT).show();
    }

    private void signWithEmailAndPassword ( String  Email , String  Password) {
        auth.createUserWithEmailAndPassword(Email, Password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(CreateNewAccount.this, "Sign Up Successful", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(CreateNewAccount.this,HomePageFace2.class);
                            startActivity(intent);
                            finish();
                        }
                        else
                            Toast.makeText(CreateNewAccount.this, "Sign Up Unsuccessful", Toast.LENGTH_SHORT).show();
                    }
                });


    }
}