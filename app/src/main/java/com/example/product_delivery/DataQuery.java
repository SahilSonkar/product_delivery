package com.example.product_delivery;

import android.content.pm.ResolveInfo;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.product_delivery.Model.Retailer_info;
import com.example.product_delivery.Model.warehouse_info;

import java.util.List;

@Dao
public interface DataQuery {

    @Insert
    void insert(Retailer_info retailer_info);

    @Update
    void update(Retailer_info retailer_info);

    @Delete
    void Delete(Retailer_info retailer_info);

    @Query("SELECT * FROM Retailer_info")
    List<Retailer_info> getAllRetailer();

    @Query("SELECT * FROM warehouse_info")
    List<warehouse_info> getAllWarehouse();
}
