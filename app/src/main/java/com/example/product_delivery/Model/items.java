package com.example.product_delivery.Model;

public class items {

    // As M1
    int count_shirts;
    //As M2
    int count_jeans;
    //An M3
    int count_shoes;

    public items() {
    }

    public items(int count_shirts, int count_jeans, int count_shoes) {
        this.count_shirts = count_shirts;
        this.count_jeans = count_jeans;
        this.count_shoes = count_shoes;
    }

    public int getCount_shirts() {
        return count_shirts;
    }

    public void setCount_shirts(int count_shirts) {
        this.count_shirts = count_shirts;
    }

    public int getCount_jeans() {
        return count_jeans;
    }

    public void setCount_jeans(int count_jeans) {
        this.count_jeans = count_jeans;
    }

    public int getCount_shoes() {
        return count_shoes;
    }

    public void setCount_shoes(int count_shoes) {
        this.count_shoes = count_shoes;
    }
}
