package com.ar.care_zone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ar.care_zone.Web_info.Allergy;
import com.ar.care_zone.Web_info.Asthma;
import com.ar.care_zone.Web_info.BloodPressure;
import com.ar.care_zone.Web_info.Coldnflu;
import com.ar.care_zone.Web_info.Diabetes;
import com.ar.care_zone.Web_info.Eye;
import com.ar.care_zone.Web_info.Gastric;
import com.ar.care_zone.Web_info.Heart;
import com.ar.care_zone.Web_info.Neurology;
import com.ar.care_zone.Web_info.Skin;

public class Cdiseases extends AppCompatActivity {


    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cdiseases);




        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b4=(Button)findViewById(R.id.btn4);
        b5=(Button)findViewById(R.id.btn5);
        b6=(Button)findViewById(R.id.btn6);
        b7=(Button)findViewById(R.id.btn7);
        b8=(Button)findViewById(R.id.btn8);
        b9=(Button)findViewById(R.id.btn9);
        b10=(Button)findViewById(R.id.btn10);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


              //  webView.loadUrl("https://www.myvmc.com/diseases/allergic-disease-an-introduction/");

                Intent i=new Intent(Cdiseases.this,Allergy.class);
                startActivity(i);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               //webView.loadUrl("https://www.nhlbi.nih.gov/health-topics/asthma");

                Intent i=new Intent(Cdiseases.this,Asthma.class);
                startActivity(i);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // webView.loadUrl("http://www.bloodpressureuk.org/BloodPressureandyou/Thebasics");

                Intent i=new Intent(Cdiseases.this,BloodPressure.class);
                startActivity(i);

            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent i=new Intent(Cdiseases.this,Gastric.class);
                startActivity(i);

                //webView.loadUrl("https://www.medicalnewstoday.com/info/cancer-oncology");

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // webView.loadUrl("https://www.codral.com.au/cold-and-flu-symptoms");

                Intent i=new Intent(Cdiseases.this,Coldnflu.class);
                startActivity(i);

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Cdiseases.this,Diabetes.class);
                startActivity(i);

               // webView.loadUrl("https://www.nhs.uk/conditions/diabetes/");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Cdiseases.this,Eye.class);
                startActivity(i);


                //webView.loadUrl("http://www.bausch.com/your-eye-concerns/diseases-and-disorders");

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(Cdiseases.this,Heart.class);
                startActivity(i);


               // webView.loadUrl("https://www.mayoclinic.org/diseases-conditions/heart-disease/symptoms-causes/syc-20353118");


            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Cdiseases.this,Neurology.class);
                startActivity(i);


                //  webView.loadUrl("https://medlineplus.gov/neurologicdiseases.html");

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Cdiseases.this,Skin.class);
                startActivity(i);

               // webView.loadUrl("https://www.healthline.com/health/skin-disorders#pictures");

            }
        });




    }
}
