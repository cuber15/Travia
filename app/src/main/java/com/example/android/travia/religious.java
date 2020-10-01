package com.example.android.travia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class religious extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religious);
        Spinner mySpinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> myAdapter= new ArrayAdapter<String>(religious.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
            if(i==1)
            {
                startActivity(new Intent(religious.this,hinduism.class ));
            }
            else if(i==2)
            {
                startActivity(new Intent(religious.this,islam.class));
            }
            else if(i==3)
            {
                startActivity(new Intent(religious.this,sikhism.class));
            }
            else if(i==4)
            {
                startActivity(new Intent(religious.this,buddhism.class));
            }
            else if(i==5)
            {
                startActivity(new Intent(religious.this,Jainism.class));
            }
            else if(i==6)
            {
                startActivity(new Intent(religious.this,Christianity.class));
            }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
