package com.ar.care_zone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Hremedy extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hremedy);


        listView=(ListView)findViewById(R.id.listViewId);
        String[] remedyNames=getResources().getStringArray(R.array.category_remedies);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Hremedy.this,R.layout.sample_view1,R.id.textViewId,remedyNames);
        listView.setAdapter(adapter);


    }
}
