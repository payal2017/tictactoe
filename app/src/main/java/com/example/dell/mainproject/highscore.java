package com.example.dell.mainproject;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class highscore extends Activity {
    private SQLiteDatabase database;
    private EditText nameTxtVW;
    private EditText phoneTxtVW;
    private ListView lstView;
    private ListAdapter listAdaptor;
    SqlHandler sqlHandler;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);
        sqlHandler = new SqlHandler(this);
        lstView = (ListView) findViewById(R.id.lst);

        showList();
    }


    private void showList() {

        ArrayList<Contactlistitems> contactList = new ArrayList<Contactlistitems>();
        contactList.clear();
        String query = "SELECT * FROM PHONE_CONTACTS ";
        Cursor c1 = sqlHandler.selectQuery(query);
        if (c1 != null && c1.getCount() != 0) {
            if (c1.moveToFirst()) {
                do {
                    Contactlistitems contactListItems = new Contactlistitems();

                    contactListItems.setSlno(c1.getString(c1
                            .getColumnIndex("slno")));
                    contactListItems.setName(c1.getString(c1
                            .getColumnIndex("name")));
                    contactListItems.setPhone(c1.getString(c1
                            .getColumnIndex("phone")));
                    contactList.add(contactListItems);

                } while (c1.moveToNext());
            }
        }
        c1.close();

        ContactListAdapter contactListAdapter = new ContactListAdapter(
                highscore.this, contactList);
        lstView.setAdapter(contactListAdapter);

    }

}