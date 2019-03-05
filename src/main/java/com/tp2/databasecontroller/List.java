package com.tp2.databasecontroller;

import java.util.ArrayList;

public class List {

    private String wishlistName;
    private String wishlistDescription;
    private ArrayList<ListEntity> items;


    public List(String wishlistName, String wishlistDescription) {
        this.wishlistName = wishlistName;
        this.wishlistDescription = wishlistDescription;
    }

    public String getWishlistName() {
        return wishlistName;
    }

    public void setWishlistName(String wishlistName) {
        this.wishlistName = wishlistName;
    }

    public String getWishlistDescription() {
        return wishlistDescription;
    }

    public void setWishlistDescription(String wishlistDescription) {
        this.wishlistDescription = wishlistDescription;
    }

    public ListEntity getItem(int index) {
        return this.items.get(index);
    }

    public ArrayList<ListEntity> getItems() {
        return items;
    }

    public void setItem(ListEntity item) {
        this.items.add(item);
    }

    public void setItems(ArrayList<ListEntity> items) {
        this.items = items;
    }
}
