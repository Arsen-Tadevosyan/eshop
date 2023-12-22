package org.example;

public interface Command {
    String EXIT = "0";
    String ADD_CATEGORY = "1";
    String EDIT_CATEGORY_BY_ID = "2";
    String DELETE_CATEGORY_BY_ID = "3";
    String ADD_PRODUCT = "4";
    String EDIT_PRODUCT_BY_ID = "5";
    String DELETE_PRODUCT_BY_ID = "6";
    String PRINT_SUM_OF_PRODUCTS = "7";
    String PRINT_MAX_OF_PRICE_PRODUCT = "8";
    String PRINT_MIN_OF_PRICE_PRODUCT = "9";
    String PRINT_AVG_OF_PRICE_PRODUCT = "10";

    static void printCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_CATEGORY + " for ADD_CATEGORY");
        System.out.println("please input " + EDIT_CATEGORY_BY_ID + " for EDIT_CATEGORY_BY_ID");
        System.out.println("please input " + DELETE_CATEGORY_BY_ID + " for DELETE_CATEGORY_BY_ID");
        System.out.println("please input " + ADD_PRODUCT + " for ADD_PRODUCT");
        System.out.println("please input " + EDIT_PRODUCT_BY_ID + " for EDIT_PRODUCT_BY_ID");
        System.out.println("please input " + DELETE_PRODUCT_BY_ID + " for DELETE_PRODUCT_BY_ID");
        System.out.println("please input " + PRINT_SUM_OF_PRODUCTS + " for PRINT_SUM_OF_PRODUCTS");
        System.out.println("please input " + PRINT_MAX_OF_PRICE_PRODUCT + " for PRINT_MAX_OF_PRICE_PRODUCT");
        System.out.println("please input " + PRINT_MIN_OF_PRICE_PRODUCT + " for PRINT_MIN_OF_PRICE_PRODUCT");
        System.out.println("please input " + PRINT_AVG_OF_PRICE_PRODUCT + " for PRINT_AVG_OF_PRICE_PRODUCT");
    }

}
