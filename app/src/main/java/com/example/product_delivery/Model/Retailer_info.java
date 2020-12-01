package com.example.product_delivery.Model;

import android.util.Pair;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Retailer_info {
    @PrimaryKey(autoGenerate = true)
    int uid;

    String Seller_name;
    String Location;
    List<items> items_count ;

    public Retailer_info(String seller_name, String location, List<items> items_count) {
        Seller_name = seller_name;
        Location = location;
        this.items_count = items_count;
    }
}
