package com.example.dell.mainproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Player extends AppCompatActivity {

    Button btnback, btnnext;
    EditText edt1,edt2;
//    String abc;
//    String abc2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        btnback = (Button) findViewById(R.id.btnback);
        btnnext = (Button) findViewById(R.id.btnnext);
        edt1=(EditText)findViewById(R.id.name1);
        edt2=(EditText)findViewById(R.id.name22);
//         abc=edt1.getText().toString().trim();
//         abc2=edt2.getText().toString().trim();
//
//

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent i = new Intent(Player.this, MainActivity.class);
                startActivity(i);

            }
        });



        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((edt1.getText().toString().trim().equals((""))) || (edt2.getText().toString().trim().equals("")) )


                {

                    showDialog3();
                }




                 else
                {


                    Intent game = new Intent(getApplicationContext(),Level.class);

                    Bundle bundle = new Bundle();
//Add your data to bundle
                    bundle.putString("one", edt1.getText().toString().trim());
                    bundle.putString("two", edt2.getText().toString().trim());
//Add the bundle to the intent
                    game.putExtras(bundle);
//
                    startActivity(game);
//
               }
//
//}
  }
            public void showDialog3() {

                AlertDialog.Builder builder = new AlertDialog.Builder(Player.this);
                builder.setTitle("OOPS!!!!");
                builder.setMessage("You Have Not Entered Values." +
                        "Please Enter Values");
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(getApplicationContext(), Player.class);
                        startActivity(i);
                        finish();
                    }
                });
                AlertDialog alertDialog = builder.create();

                alertDialog.show();


            }


   // }
        });
}}