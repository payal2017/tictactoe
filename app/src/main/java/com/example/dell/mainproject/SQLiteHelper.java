package com.example.dell.mainproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Dell on 05/11/2016.
 */
public class SQLiteHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "gme_database.txt";
    private static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME = "game_table";
    public static final String SCORE = "score";
    public static final String NAME="name";



    SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



        @Override
        public void onCreate (SQLiteDatabase db){
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (" + NAME
                + " VARCHAR(25),"+ SCORE +" INTEGER )");
    }



        @Override
        public void onUpgrade (SQLiteDatabase db,int i, int i1){
            Log.w("LOG_TAG", "Upgrading database from version " + i + " to " + i1
                    + ", which will destroy all old data");

            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);


            onCreate(db);

    }
    }

