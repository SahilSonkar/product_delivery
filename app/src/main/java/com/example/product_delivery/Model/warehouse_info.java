package com.example.product_delivery.Model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.product_delivery.Model.items;

import java.util.ArrayList;
import java.util.List;

@Entity
public class warehouse_info {
    @PrimaryKey(autoGenerate = true)
    int uid;

    String warehorse_name;
    String location;
    List<items> items_count ;

    public warehouse_info(String warehorse_name , String location,List<items> items_count) {
        this.warehorse_name = warehorse_name;
        this.location = location;
        this.items_count = items_count;
    }
}
