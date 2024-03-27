package org.streamapi.practice;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

        String[] products = getProducts();

        System.out.println("All Products: \n" + Arrays.toString(products));

    }

    private static String[] getProducts() {
        return new String[]{
                "Cherry",
                "Rice",
                "Orange",
                "Pork",
                "Carrot",
                "Onion",
                "Cherry",
                "Pork",
                "Melon",
                "Milk",
                "Potato",
                "Carrot",
                "Cherry",
                "Rice",
                "Milk"
        };
    }

}
