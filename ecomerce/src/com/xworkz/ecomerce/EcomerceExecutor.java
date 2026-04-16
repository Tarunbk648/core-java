package com.xworkz.ecomerce;

import com.xworkz.ecomerce.ecomerce.EcomerceValidator;
import com.xworkz.ecomerce.product.Product;

public class EcomerceExecutor {
    public static void main(String[] args) {
        EcomerceValidator ecomerceValidator= new EcomerceValidator();
        Product product= new Product();
        product.setUniqueId(1);
        String[] name={"Dolo", "lyzol"};
        product.setName(name);
        product.setCost(125.45);
        product.setMfgDate("04/12/2025");
        ecomerceValidator.addEcommerceData(product);

        System.out.println();
        ecomerceValidator.updateMfgDateByUniqueId("05/12/2025",1);

        System.out.println();
        ecomerceValidator.updateCostByUniqueId(158.00,1);

        System.out.println();
        ecomerceValidator.getIdByCost(158.00);

        System.out.println();
        ecomerceValidator.getMfgDateById(1);

        System.out.println();
        ecomerceValidator.getAllDetails();


    }


}
