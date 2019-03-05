package com.tp2.databasecontroller;

public class ListEntity {

    private String listEntityName;
    private Double listEntityPrice;
    private String listEntityUrl;
    private String listEntityDescription;

    public ListEntity(String listEntityName, Double listEntityPrice, String listEntityUrl, String listEntityDescription) {
        this.listEntityName = listEntityName;
        this.listEntityPrice = listEntityPrice;
        this.listEntityUrl = listEntityUrl;
        this.listEntityDescription = listEntityDescription;
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
