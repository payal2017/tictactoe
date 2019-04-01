package com.example.dell.mainproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnply,btnhighscore,btninfo;
//MediaController m;
    //MediaPlayer bgmusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView splash = (ImageView) findViewById(R.id.naw);

       RotateAnimation anim = new RotateAnimation(0.0f, 360.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);


        anim.setDuration(7000);

        splash.startAnimation(anim);


        btnply=(Button)findViewById(R.id.btnplayer);

        btnhighscore=(Button)findViewById(R.id.btnhs);
        btninfo=(Button)findViewById(R.id.btninfo);



      // bgmusic= MediaPlayer.create(MainActivity.this,R.raw.bacgmusi);
       // bgmusic.setLooping(true);
       // bgmusic.start();

        btnply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Player.class);
                startActivity(intent);

            }
        });



        btnhighscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(MainActivity.this,highscore.class);
                startActivity(k);
            }
        });

        btninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h=new Intent(MainActivity.this,howtoplay.class);
                startActivity(h);
            }
        });



    }


    }

