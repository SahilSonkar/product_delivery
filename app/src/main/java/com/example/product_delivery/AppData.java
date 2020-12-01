package com.example.product_delivery;

import android.content.Context;
import android.net.CaptivePortal;

import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.product_delivery.Model.Retailer_info;
import com.example.product_delivery.Model.warehouse_info;

@Database(entities = {warehouse_info.class,Retailer_info.class},version = 1)
public abstract class  AppData extends RoomDatabase {

    public abstract DataQuery dataQuery();
    public static AppData appData;
    public static AppData getInstance(Context context){
        if(appData == null)
        appData = Room.databaseBuilder(context , AppData.class,"sdfgh").build();
        return appData;
    }
}
