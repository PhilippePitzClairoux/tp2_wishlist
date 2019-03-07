package com.tp2.databasecontroller;

import java.util.ArrayList;

public class List {

    private String listName;
    private String listDescription;
    private ArrayList<ListEntity> listItems;
    private Integer listId;


    //Class getteurs/setteurs for the db

    /**
     * Remove all the entities from the list and
     * completely removes the list from the database.
     */
    public void removeList() {

    }

    /**
     * This method loads all the info of a list and all it's
     * Entities.
     */
    public void loadList() {

    }

    /**
     * Create a new list in the database
     * This method will NOT add items in the list
     */
    public void createList() {

    }

    /**
     * Add/delete ListEntities to the database and update
     * the various info a list holds.
     */
    public void updateList() {

    }

    //Class getteurs/setteurs

    public List(String wishlistName, String wishlistDescription) {
        this.listName = wishlistName;
        this.listDescription = wishlistDescription;
    }

    public List(Integer listId) {
        this.listId = listId;
    }

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getListDescription() {
        return listDescription;
    }

    public void setListDescription(String listDescription) {
        this.listDescription = listDescription;
    }

    public ListEntity getItem(int index) {
        return this.listItems.get(index);
    }

    public ArrayList<ListEntity> getListItems() {
        return listItems;
    }

    public void addItem(ListEntity item) {
        this.listItems.add(item);
    }

    public void setListItems(ArrayList<ListEntity> listItems) {
        this.listItems = listItems;
    }
}
