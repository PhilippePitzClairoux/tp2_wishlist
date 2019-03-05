package com.tp2.databasecontroller;


public class ListCategory {

    private String listCategoryName;
    private String listCategoryDescription;

    //Class getteurs/setteurs for database
    /**
     * Remove the category that has the same name and
     * description than this current object
     */
    public void removeCategory() {

    }

    /**
     * Load a category based on it's id
     * @param id The id of the category
     */
    public void loadCategory(int id) {

    }

    /**
     * Creates the current category in the database if it doesnt already exist
     */
    public void createNewCategory() {

    }

    /**
     * Modifies the description of the category in the database
     */
    public void updateListCategory() {

    }

    //Class getteurs/setteurs

    public ListCategory(String listCategoryName, String listCategoryDescription) {
        this.listCategoryName = listCategoryName;
        this.listCategoryDescription = listCategoryDescription;
    }

    public String getListCategoryName() {
        return listCategoryName;
    }

    public void setListCategoryName(String listCategoryName) {
        this.listCategoryName = listCategoryName;
    }

    public String getListCategoryDescription() {
        return listCategoryDescription;
    }

    public void setListCategoryDescription(String listCategoryDescription) {
        this.listCategoryDescription = listCategoryDescription;
    }
}
