package com.tp2.databasecontroller;

public class ListEntity {

    private String listEntityName;
    private Double listEntityPrice;
    private String listEntityUrl;
    private String listEntityDescription;
    private Integer listEntityId;

    //Class getteurs/setteurs for database

    /**
     * Remove a ListEntity based on the current EntityId
     * of this object. If it's not set, retrive it using
     * EntityName and EntityDescription.
     */
    public void removeListEntity() {

    }

    /**
     * Load a ListEntity based on the current EntityId
     */
    public void loadListEntity() {

    }

    /**
     * Create a new ListEntity in the database
     * Will also set the value of listEntityId
     */
    public void createNewListEntity() {

    }

    /**
     * Updates EntityPirce, EntityUrl and EntityDescription in the database
     * based on the current EntityName and EntityId
     */
    public void updateListEntity() {

    }


    //Class getteurs/setteurs
    public ListEntity(String listEntityName, Double listEntityPrice, String listEntityUrl, String listEntityDescription) {
        this.listEntityName = listEntityName;
        this.listEntityPrice = listEntityPrice;
        this.listEntityUrl = listEntityUrl;
        this.listEntityDescription = listEntityDescription;
    }

    public ListEntity(Integer listEntityId) {
        this.listEntityId = listEntityId;
    }

    public Integer getListEntityId() {
        return listEntityId;
    }

    public void setListEntityId(Integer listEntityId) {
        this.listEntityId = listEntityId;
    }

    public String getListEntityName() {
        return listEntityName;
    }

    public void setListEntityName(String listEntityName) {
        this.listEntityName = listEntityName;
    }

    public Double getListEntityPrice() {
        return listEntityPrice;
    }

    public void setListEntityPrice(Double listEntityPrice) {
        this.listEntityPrice = listEntityPrice;
    }

    public String getListEntityUrl() {
        return listEntityUrl;
    }

    public void setListEntityUrl(String listEntityUrl) {
        this.listEntityUrl = listEntityUrl;
    }

    public String getListEntityDescription() {
        return listEntityDescription;
    }

    public void setListEntityDescription(String listEntityDescription) {
        this.listEntityDescription = listEntityDescription;
    }
}
