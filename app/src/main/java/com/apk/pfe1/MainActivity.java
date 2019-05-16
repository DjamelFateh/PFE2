package com.apk.pfe1;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout dra;
    private ActionBarDrawerToggle tog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dra =(DrawerLayout) findViewById(R.id.drawwer);
        tog =new ActionBarDrawerToggle(this,dra,R.string.open,R.string.close);
        dra.addDrawerListener(tog);
        tog.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


   // signaler un risque
        Button signaler = (Button) findViewById(R.id.button);
        signaler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent problemes=new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(problemes);
            }
        });
   //****************

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater flat =getMenuInflater();
        flat.inflate(R.menu.lang,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(tog.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
}
