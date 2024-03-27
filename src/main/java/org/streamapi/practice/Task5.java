package org.streamapi.practice;

import org.streamapi.practice.entity.Projector;

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {

        Projector[] devices = getProjectors();

        System.out.println("All Projectors: \n" + Arrays.toString(devices));

    }

    private static Projector[] getProjectors() {
        return new Projector[]{
                new Projector("Vision", 2018, "Sony"),
                new Projector("GlassProj", 2014, "Phillips"),
                new Projector("ProjectPro", 2018, "Samsung"),
                new Projector("SeeClear", 2020, "Apple"),
                new Projector("ShowMore", 2016, "Sony"),
                new Projector("EyeHill", 2014, "Phillips"),
                new Projector("LandView", 2021, "Apple"),
                new Projector("ShowMore", 2016, "Phillips"),
        };
    }

}
