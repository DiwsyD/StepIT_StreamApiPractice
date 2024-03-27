package org.streamapi.practice;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {
        List<Integer> randomValues = new Random()
                .ints(25, -200, 200)
                .boxed().collect(Collectors.toList());

        System.out.println("Random values: \n"+ randomValues + "\n");



    }


}
