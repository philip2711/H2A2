package com.example.h2a2;

public class Menu {

    private int menuId;
    private String price;
    private String fname;
    private String description;

    public Menu(int menuId, String price, String fname, String description) {
        this.menuId = menuId;
        this.price = price;
        this.fname = fname;
        this.description = description;

    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getPrice() { return price; }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
