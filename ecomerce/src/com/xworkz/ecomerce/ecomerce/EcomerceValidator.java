package com.xworkz.ecomerce.ecomerce;

import com.xworkz.ecomerce.product.Product;

public class EcomerceValidator {
    Product[] products = new Product[1];
    int index;

    public boolean addEcommerceData(Product product) {
        boolean isDataAdded = false;
        boolean isUniqueIdValid = false;
        boolean isNameValid = false;
        boolean isMfgDateValid = false;
        boolean isCostValid = false;

        int id = product.getUniqueId();
        if (id > 0) {
            isUniqueIdValid = true;
        }
        String[] name = product.getName();
        if (name != null) {
            isNameValid = true;
        }

        String mfg = product.getMfgDate();
        if (mfg != null && !mfg.isEmpty()) {
            isMfgDateValid = true;
        }

        double cost = product.getCost();
        if (cost > 0) {
            isCostValid = true;

        }

        if (isUniqueIdValid == true && isNameValid == true && isMfgDateValid == true && isCostValid == true) {
            this.products[index++] = product;
            isDataAdded = true;
        }
        return isDataAdded;


    }

    //UPDATING THE DETAILS
    public boolean updateMfgDateByUniqueId(String updateMfg, int uniqueId) {
        boolean isMfgDateUpdated = false;
        if (uniqueId > 0) {
            for (int i = 0; i < products.length; i++) {
                if (products[i]!=null && uniqueId == products[i].getUniqueId()) {
                    String oldmfg = products[i].getMfgDate();
                    products[i].setMfgDate(updateMfg);
                    System.out.println("The product Id is:" + uniqueId);
                    System.out.println("The existing Mfg is:" + oldmfg + " is updated to " + products[i].getMfgDate());
                    isMfgDateUpdated = true;
                }

            }
        }
        return isMfgDateUpdated;
    }

    public boolean updateCostByUniqueId(double cost, int uniqueId) {
        boolean isCostUpdated = false;
        if (uniqueId > 0) {
            for (int i = 0; i < products.length; i++) {
                if (products[i]!=null && uniqueId == products[i].getUniqueId()) {
                    double oldCost = products[i].getCost();
                    products[i].setCost(cost);
                    System.out.println("The product id is:" + uniqueId);
                    System.out.println("The product existing cost is:" + oldCost + " is updated to " + products[i].getCost());
                    isCostUpdated = true;
                }

            }
        }
        return isCostUpdated;
    }

    //Getting the value using get Method

    public void getIdByCost(double cost) {
        if (cost > 0) {
            for (int i = 0; i < products.length; i++) {
                if (products[i]!=null && cost == products[i].getCost()) {
                    int id = products[i].getUniqueId();
                    System.out.println("Getting a Unique Id by cost is:" + id);
                }

            }
        }
    }

    public void getMfgDateById(int id) {
        if (id > 0) {
            for (int i = 0; i < products.length; i++) {
                if (products[i] !=null && id == products[i].getUniqueId()) {
                    String date = products[i].getMfgDate();
                    System.out.println("Getting mfg date by id:" + date);
                }

            }
        }
    }


    public void getAllDetails() {
        for (Product product : products) {
            if (product != null) {
                System.out.println("Product unique id:" + product.getUniqueId());
                System.out.println("Product mfgDate:" + product.getMfgDate());
                System.out.println("Product cost:" + product.getCost());
                System.out.println("LISTS OF PRODUCT NAME");
                for (String name : product.getName()) {
                    System.out.println(name + " ");
                }
            }
        }
    }


    }

