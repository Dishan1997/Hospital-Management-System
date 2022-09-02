package com.ar.care_zone;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.ref.WeakReference;

public class Signup extends AppCompatActivity implements View.OnClickListener {

    private EditText nameEditText, emailEditText, usernameEditText, passwordEditText ;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        nameEditText = (EditText) findViewById(R.id.nameEditTextId);
        emailEditText = (EditText) findViewById(R.id.signUpEmailEditTextId);
        usernameEditText = (EditText) findViewById(R.id.signUpUsernameEdiTextId);
        passwordEditText = (EditText) findViewById(R.id.signUpPasswordEditTextId);

        signUpButton = (Button) findViewById(R.id.signUpButtonId);

        signUpButton.setOnClickListener(this);

        String name = nameEditText.getText().toString();
        String email = nameEditText.getText().toString();
        String username = nameEditText.getText().toString();
        String pass1 = nameEditText.getText().toString();
        String pass2 = nameEditText.getText().toString();


    }


    @Override
    public void onClick(View v) {
        {

            if (v.getId() == R.id.signUpButtonId) {






                    Toast.makeText(Signup.this, "Sign Up Completed", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Signup.this, Signin.class);

                    startActivity(intent);



            }


        }


    }
}





























