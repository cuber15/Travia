package com.example.android.travia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class page2 extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Button rel=(Button)findViewById(R.id.button4);
        Button adv=(Button)findViewById(R.id.adventurous);
        Button royal=(Button)findViewById(R.id.button6);
        Button seas=(Button)findViewById(R.id.button7);
        Button terr=(Button)findViewById(R.id.religious);
        firebaseAuth= FirebaseAuth.getInstance();

        rel.setOnClickListener(new View.OnClickListener()
        {
            @Override
                    public void onClick(View view){

                Intent int1=new Intent(page2.this,religious.class);
                startActivity(int1);
            }
        });
        adv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){

                Intent int2=new Intent(page2.this,adventurous.class);
                startActivity(int2);
            }
        });
        royal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){

                Intent int3=new Intent(page2.this,royal.class);
                startActivity(int3);
            }
        });
        seas.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){

                Intent int4=new Intent(page2.this,season.class);
                startActivity(int4);
            }
        });
        terr.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){

                Intent int5=new Intent(page2.this,terrain.class);
                startActivity(int5);
            }
        });



    }

private void Logout()
{
    firebaseAuth.signOut();
    finish();
    startActivity(new Intent(page2.this,Login.class));
}
@Override
    public boolean onCreateOptionsMenu(Menu menu)
{
    getMenuInflater().inflate(R.menu.menu,menu);
    return true;
}

@Override
    public boolean onOptionsItemSelected(MenuItem item)
{
    switch(item.getItemId())
    {
        case R.id.logoutmenu:{
        Logout();
        }
        break;
        default: throw new IllegalStateException("Unexpected value: " + item.getItemId());
    }
    return super.onOptionsItemSelected(item);
}
}
