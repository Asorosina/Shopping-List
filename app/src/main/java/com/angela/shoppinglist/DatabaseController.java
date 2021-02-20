package com.angela.shoppinglist;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DatabaseController extends SQLiteOpenHelper {
    public DatabaseController(Context context) {
        super(context, Util.DATABASE_ITEM, null, Util.DATABASE_VERSION);
    }


    // create a table
    @Override
    public void onCreate(SQLiteDatabase db) {

        /*
           create table _name(id, name, phone_number);
         */
        String CREATE_ITEMS_TABLE = "CREATE TABLE " + Util.TABLE_NAME+ "("
                + Util.KEY_ID + " INTEGER PRIMARY KEY," + Util.KEY_ITEM + " TEXT"
                +")";
        db.execSQL(CREATE_ITEMS_TABLE); //to create table

    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String DROP_TABLE = String.valueOf(R.string.db_drop);
        db.execSQL(DROP_TABLE, new String[]{Util.DATABASE_ITEM});

        //Create a table again
        onCreate(db);
    }


    /**
     * to add items
     */
    public void addItem(String item) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Util.KEY_ITEM, item );


        //Insert to row
        db.insert(Util.TABLE_NAME, null, values);

        Log.d("DBHandler", "addContact: " + "item added");
        db.close(); //closing db connection
    }
    //get item
    public String getItem(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(Util.TABLE_NAME,
                new String[]{ Util.KEY_ID, Util.KEY_ITEM},
                Util.KEY_ID +"=?",new String[]{String.valueOf(id)},
                null, null, null);

        if (cursor != null)
            cursor.moveToFirst();

        //Items item = new Items("carrots");
       // item.setId(Integer.parseInt(cursor.getString(0)));
       // item.setName(cursor.getString(1));


        return cursor.getString(1);
    }

    //update item
    public int updateItem(int id, String item) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Util.KEY_ITEM, item);


        //update the row
        //update(tablename, values, where id = 43)
        return db.update(Util.TABLE_NAME, values, Util.KEY_ID + "=?",
                new String[]{String.valueOf(id)});
    }


}
