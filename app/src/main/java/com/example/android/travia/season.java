package com.example.android.travia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class season extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season);
        Spinner mySpinner = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<String> myAdapter=new ArrayAdapter<>(season.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.name6));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                if(i==1)
                {
                    startActivity(new Intent(season.this,dentist.class));
                }
                else if(i==2)
                {
                    startActivity(new Intent(season.this,cosmetics.class));
                }
                else if(i==3)
                {
                    startActivity(new Intent(season.this,cardiology.class));
                }
                else if(i==4)
                {
                    startActivity(new Intent(season.this,cancer.class));
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
