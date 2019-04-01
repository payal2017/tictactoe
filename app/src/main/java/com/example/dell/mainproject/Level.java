package com.example.dell.mainproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Level extends AppCompatActivity {

    Button b ,bhard;
    EditText h,v;
String player1;
     String player2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        bhard = (Button) findViewById(R.id.hard);
        b=(Button)findViewById(R.id.btneasy);
        h=(EditText)findViewById(R.id.name1);
        v=(EditText)findViewById(R.id.name22);

        Bundle bundle = getIntent().getExtras();
        //Bundle ss=getIntent().getExtras();
        player1 = bundle.getString("one");
        player2 = bundle.getString("two");

        bhard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Maingamehard.class);
                Bundle bundle = new Bundle();

                bundle.putString("one", player1);
                bundle.putString("two", player2);

                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i =new Intent(getApplicationContext(),Maingame.class);

                Bundle bundle = new Bundle();

                bundle.putString("one", player1);
                bundle.putString("two", player2);

                i.putExtras(bundle);

                startActivity(i);

            }


    });








    }
}