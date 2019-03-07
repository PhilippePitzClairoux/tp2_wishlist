package com.tp2.databasecontroller;


import com.tp2.exceptions.CannotCreateCategory;
import com.tp2.exceptions.CannotRemoveCategory;
import com.tp2.exceptions.InvalidCategory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListCategory {

    private String listCategoryName;
    private Integer listCategoryId;

    //Class getteurs/setteurs for database
    /**
     * Remove the category that has the same name and
     * description than this current object
     */
    public void removeCategory() throws SQLException {

        Connection conn = ConnectionManager.getConnection();
        PreparedStatement stat = conn.prepareStatement(
                "DELETE FROM wishlist_category WHERE id_wishlist_category = ?");

        stat.setInt(1, this.getListCategoryId());

        if (stat.executeUpdate() != 1)
            throw new CannotRemoveCategory();

        this.setListCategoryName("");
        this.setListCategoryId(0);
    }

    /**
     * Load a category based on it's listCategoryId
     */
    public void loadCategory() throws SQLException {

        Connection conn = ConnectionManager.getConnection();
        PreparedStatement stat = conn.prepareStatement(
                "SELECT wishlist_category.name " +
                        "FROM wishlist_category WHERE id_item_category = ?");

        stat.setInt(1, this.getListCategoryId());

        stat.execute();
        ResultSet rs = stat.getResultSet();

        if (!rs.next())
            throw new InvalidCategory();

        this.setListCategoryName(rs.getString("name"));

        stat.close();
        conn.close();
    }

    /**
     * Creates the current category in the database if it doesnt already exist
     * This will also set the value of listCategoryId
     */
    public void createNewCategory() throws SQLException {

        Connection conn = ConnectionManager.getConnection();
        PreparedStatement stat = conn.prepareStatement(
                "INSERT INTO wishlist_category(wishlist_category.name) VALUES (?)");

        stat.setString(1, this.getListCategoryName());

        if (stat.executeUpdate() != 1)
            throw new CannotCreateCategory();

        stat.close();
        conn.close();
    }

    //Class getteurs/setteurs

    public ListCategory(String listCategoryName) {
        this.listCategoryName = listCategoryName;

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

}
