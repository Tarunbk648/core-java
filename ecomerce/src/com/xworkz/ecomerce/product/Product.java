package com.xworkz.ecomerce.product;

public class Product {
    private int uniqueId;
    private String[] name;
    private String mfgDate;
    private double cost;

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public void setMfgDate(String mfgDate) {
        this.mfgDate = mfgDate;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public String[] getName() {
        return name;
    }

    public String getMfgDate() {
        return mfgDate;
    }

    public double getCost() {
        return cost;
    }


}
