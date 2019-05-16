package com.apk.pfe1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button pho=(Button) findViewById(R.id.rock);
        Button pho1=(Button) findViewById(R.id.rock2);
        Button pho2=(Button) findViewById(R.id.rock3);
        Button pho3=(Button) findViewById(R.id.rock4);

        pho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(intent);
            }
        });
        pho1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(intent1);
            }
        });

        pho2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(intent2);
            }
        });
        pho3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(intent3);
            }
        });
    }
}
