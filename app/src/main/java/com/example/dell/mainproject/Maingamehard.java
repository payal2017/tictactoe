package com.example.dell.mainproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Maingamehard extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;

    int turn;
    String h,k;
    TextView mTextField;
    EditText e,e1;
    SqlHandler sqlHandler;

    private SQLiteDatabase database;
    private EditText nameTxtVW;
    private EditText phoneTxtVW;
    private ListView lstView;
    private ListAdapter listAdaptor;
    String player1;
    String player2;
    String score1="Win";
    String score2="Lose";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maingame);


        Bundle ss=getIntent().getExtras();


        player1 = ss.getString("one");
        player2 = ss.getString("two");

        sqlHandler=new SqlHandler(this);
        mTextField=(TextView)findViewById(R.id.mTextField);
        new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {
                mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);


            }

            public void onFinish() {

                showDialogPop();
            }

        }.start();


        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);

        turn =1;



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b1.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                    } else if (turn == 2){
                        turn = 1;
                        b1.setText("0");

                    }

                }
                endGame();
            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b2.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                    } else if (turn == 2){
                        turn = 1;
                        b2.setText("0");

                    }

                }
                endGame();
            }

        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b3.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                    } else if (turn == 2){
                        turn = 1;
                        b3.setText("0");

                    }

                }
                endGame();
            }

        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b4.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                    } else if (turn == 2){
                        turn = 1;
                        b4.setText("0");

                    }

                }
                endGame();
            }

        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b5.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                    } else if (turn == 2){
                        turn = 1;
                        b5.setText("0");

                    }

                }
                endGame();
            }

        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b6.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                    } else if (turn == 2){
                        turn = 1;
                        b6.setText("0");

                    }

                }
                endGame();
            }

        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b7.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                    } else if (turn == 2){
                        turn = 1;
                        b7.setText("0");

                    }

                }
                endGame();
            }

        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b8.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                    } else if (turn == 2){
                        turn = 1;
                        b8.setText("0");

                    }

                }
                endGame();
            }

        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b9.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                    } else if (turn == 2){
                        turn = 1;
                        b9.setText("0");

                    }

                }
                endGame();
            }

        });



    }


    public void showDialogPop() {

        AlertDialog.Builder builder = new AlertDialog.Builder(Maingamehard.this);
        builder.setTitle("Time Up!!!");
        builder.setMessage("You missed the game,It's time up!!");
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();

        alertDialog.show();
    }

    public void showDialogPop1() {

        AlertDialog.Builder builder = new AlertDialog.Builder(Maingamehard.this);
        builder.setTitle("Game End");
        builder.setMessage("Winner is " +player1);
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                String query = "INSERT INTO PHONE_CONTACTS(name,phone) values ('"
                        + player1 + "','" + score1+ "')";
                sqlHandler.executeQuery(query);
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();

        alertDialog.show();


    }
    public void showDialogPop2() {

        AlertDialog.Builder builder = new AlertDialog.Builder(Maingamehard.this);
        builder.setTitle("Game End");
        builder.setMessage("Winner is "+player2);
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

             /*   String name = etName.getText().toString();
                String phoneNo = etPhone.getText().toString();*/

                String query = "INSERT INTO PHONE_CONTACTS(name,phone) values ('"
                        + player2 + "','" + score2+ "')";
                sqlHandler.executeQuery(query);




                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();

        alertDialog.show();

    }
    public void showDialogPop3() {

        AlertDialog.Builder builder = new AlertDialog.Builder(Maingamehard.this);
        builder.setTitle("Draw");
        builder.setMessage("Try Again");
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();

        alertDialog.show();


    }
    public boolean endGame(){

        String a,b,c,d,e,f,g,h,i;
        boolean end=false;

        a=b1.getText().toString();
        b=b2.getText().toString();
        c=b3.getText().toString();
        d=b4.getText().toString();
        e=b5.getText().toString();
        f=b6.getText().toString();
        g=b7.getText().toString();
        h=b8.getText().toString();
        i=b9.getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            showDialogPop1();
            end=true;
        }

        if (a.equals("X") && d.equals("X") && g.equals("X")) {
            showDialogPop1();
            end=true;
        }
        if (a.equals("X") && e.equals("X") && i.equals("X")) {
            showDialogPop1();
            end=true;
        }
        if (g.equals("X") && e.equals("X") && f.equals("X")) {
            showDialogPop1();
            end=true;
        }
        if (b.equals("X") && e.equals("X") && h.equals("X")) {
            showDialogPop1();
            end=true;
        }
        if (c.equals("X") && f.equals("X") && i.equals("X")) {
            showDialogPop1();
            end=true;
        }
        if (d.equals("X") && e.equals("X") && f.equals("X")) {
            showDialogPop1();
            end=true;
        }
        if (g.equals("X") && h.equals("X") && i.equals("X")) {
            showDialogPop1();
            end=true;
        }
        if (a.equals("0") && b.equals("0") && c.equals("0")) {
            showDialogPop2();
            end=true;
        }
        if (a.equals("0") && e.equals("0") && i.equals("0")) {
            showDialogPop2();
            end=true;
        }
        if (g.equals("0") && e.equals("0") && f.equals("0")) {
            showDialogPop2();
            end=true;
        }
        if (a.equals("0") && d.equals("0") && g.equals("0")) {
            showDialogPop2();
            end=true;
        }
        if (g.equals("0") && h.equals("0") && i.equals("0")) {
            showDialogPop2();
            end=true;
        }
        if (c.equals("0") && f.equals("0") && i.equals("0")) {
            showDialogPop2();
            end=true;
        }
        if (b.equals("0") && e.equals("0") && h.equals("0")) {
            showDialogPop2();
            end=true;
        }
        if (d.equals("0") && e.equals("0") && f.equals("0")) {
            showDialogPop2();
            end=true;
        }
        if (a.equals("0") && b.equals("X") && c.equals("X") && d.equals("0") && e.equals("X") && f.equals("0") && g.equals("X") && h.equals("0") && i.equals("X")) {
            showDialogPop3();
            end=true;
        }
        if (end) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);

        }

        return end;
    }
}

