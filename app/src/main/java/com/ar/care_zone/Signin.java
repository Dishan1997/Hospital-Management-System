package com.ar.care_zone;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.ref.WeakReference;

public class Signin extends AppCompatActivity implements View.OnClickListener {

    private Button signInButton,signUpHereButton;
    private EditText usernameEditText;
    private EditText passwordeEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        signInButton=(Button) findViewById(R.id.signInButtonId);
        signUpHereButton=(Button) findViewById(R.id.signUpHereButtonId);
        usernameEditText=(EditText) findViewById(R.id.signInusernameEditTextId);
        passwordeEditText=(EditText) findViewById(R.id.signInpasswordEditTextId);



        signInButton.setOnClickListener(this);

        signUpHereButton.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {

        String username=usernameEditText.getText().toString();
        String password=passwordeEditText.getText().toString();


        if(v.getId()==R.id.signInButtonId)
        {
                  if(username.equals("Anika") && password.equals("1234")) {

                      Intent intent = new Intent(Signin.this, Category.class);
                      startActivity(intent);
                  }



        }

        else if(v.getId()==R.id.signUpHereButtonId)
        {
            Intent intent =new Intent(Signin.this,Signup.class) ;
            startActivity(intent);
        }

    }


}
