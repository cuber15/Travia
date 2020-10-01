package com.example.android.travia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class adventurous extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventurous);
        Spinner mySpinner = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> myAdapter=new ArrayAdapter<>(adventurous.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.name2));
        mySpinner.setAdapter(myAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                if(i==1) {
                    startActivity(new Intent(adventurous.this, northadv.class));

                }
                else if(i==2)
                {
                    startActivity(new Intent(adventurous.this, eastadv.class));
                }
                else if(i==3)
                {
                    startActivity(new Intent(adventurous.this, westadv.class));

                }
                else if(i==4)
                {
                    startActivity(new Intent(adventurous.this,southadv.class));
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
