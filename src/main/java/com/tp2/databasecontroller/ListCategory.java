package com.tp2.databasecontroller;


public class ListCategory {

    private String listCategoryName;
    private String listCategoryDescription;
    private Integer listCategoryId;

    //Class getteurs/setteurs for database
    /**
     * Remove the category that has the same name and
     * description than this current object
     */
    public void removeCategory() {

    }

    /**
     * Load a category based on it's listCategoryId
     */
    public void loadCategory() {

    }

    /**
     * Creates the current category in the database if it doesnt already exist
     * This will also set the value of listCategoryId
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

    public ListCategory(Integer id) {
        this.listCategoryId = id;
    }

    public Integer getListCategoryId() {
        return listCategoryId;
    }

    public void setListCategoryId(Integer listCategoryId) {
        this.listCategoryId = listCategoryId;
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
