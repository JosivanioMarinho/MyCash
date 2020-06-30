package com.gameon.mycash_carteiradigital.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    private static int VERSION = 5;
    private static String NAME_DB = "MYCASH";
    public static String TABLE_CATEGORY = "category";
    public static String TABLE_INPUT = "input";
    public static String TABLE_OUTPUT = "output";

    public DbHelper(@Nullable Context context) {
        super(context, NAME_DB, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String tableCategorySQL = " CREATE TABLE IF NOT EXISTS "+ TABLE_CATEGORY
                + " (id_cat INTEGER PRIMARY KEY AUTOINCREMENT,"
                + " name_cat TEXT NOT NULL,"
                + " type_cat TEXT NOT NULL); ";

        String tableInputSQL = " CREATE TABLE IF NOT EXISTS "+ TABLE_INPUT
                + " (id_input INTEGER PRIMARY KEY AUTOINCREMENT, "
                + " date_input TEXT NOT NULL, "
                + " value_input FLOAT NOT NULL, "
                + " description_input TEXT NOT NULL, "
                + " id_cat INTEGER NOT NULL,"
                + " FOREIGN KEY (id_cat) REFERENCES " + TABLE_CATEGORY + " (id_cat)); ";

        String tableOutputSQL = " CREATE TABLE IF NOT EXISTS "+ TABLE_OUTPUT
                + " (id_output INTEGER PRIMARY KEY AUTOINCREMENT,"
                + " date_output TEXT NOT NULL,"
                + " value_output FLOAT NOT NULL,"
                + " description_output TEXT NOT NULL,"
                + " id_cat INTEGER NOT NULL,"
                + " FOREIGN KEY (id_cat) REFERENCES " + TABLE_CATEGORY + " (id_cat)); ";

        try{
            db.execSQL(tableCategorySQL);
            db.execSQL(tableInputSQL);
            db.execSQL(tableOutputSQL);
            Log.i("infotables", "Sucesso ao criar tabelas! ");
        }catch (Exception e){
            Log.i("infotables", "Erro ao criar tabelas! "+ e.getMessage());
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        try {
            onCreate(db);
            Log.i("dbupdate", "Sucesso ao criar tabelas!");
        }catch (Exception e){
            Log.i("dbupdate", "Erro ao criar tabelas! --- "+ e.getMessage());
        }

    }
}
