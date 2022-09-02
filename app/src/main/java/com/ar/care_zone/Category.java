package com.ar.care_zone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Category extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        //String username=getIntent().getStringExtra("Username");
       // String password=getIntent().getStringExtra("Password");



        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b4=(Button)findViewById(R.id.btn4);
        b5=(Button)findViewById(R.id.btn5);
        b6=(Button)findViewById(R.id.btn6);
        b7=(Button)findViewById(R.id.btn7);
        b8=(Button)findViewById(R.id.btn8);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Clicked on ",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(Category.this,Cdiseases.class);
                startActivity(i);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Clicked on ",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(Category.this,Hremedy.class);
                startActivity(i);

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Clicked on ",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(Category.this,BMI.class);
                startActivity(i);

            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Clicked on ",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(Category.this,Htips.class);
                startActivity(i);

            }
        });




    }
}
