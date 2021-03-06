package com.laioffer.tinnews;

import android.app.Application;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.facebook.stetho.Stetho;
import com.laioffer.tinnews.database.TinNewsDatabase;

public class TinNewsApplication extends Application {
    private static TinNewsDatabase database; // it's a singleton

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);

        database = Room.databaseBuilder(this, TinNewsDatabase.class, "tinnews_db").build();


    }

    public static TinNewsDatabase getDatabase() {
        return database;
    }
}
