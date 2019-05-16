package com.apk.pfe1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private TextView tt;
    private SeekBar seek;
    private ImageView img;
    private Button take;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        take=(Button) findViewById(R.id.phot);
        take.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent camo=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(camo,0);
            }
        });
         seek=(SeekBar) findViewById(R.id.seekBar);
         tt=(TextView)findViewById(R.id.View6);
         seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
             @Override
             public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                 tt.setText("" + progress+"%");
             }

             @Override
             public void onStartTrackingTouch(SeekBar seekBar) {

             }

             @Override
             public void onStopTrackingTouch(SeekBar seekBar) {

             }
         });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        img=(ImageView) findViewById(R.id.img2);
        Bitmap bit=(Bitmap)data.getExtras().get("data");
        img.setImageBitmap(bit);
    }
}
