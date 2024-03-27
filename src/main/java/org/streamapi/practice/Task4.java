package org.streamapi.practice;

import org.streamapi.practice.entity.Device;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {

        Device[] devices = getDevices();

        System.out.println("All Devices: \n" + Arrays.toString(devices));

    }

    private static Device[] getDevices() {
        return new Device[] {
                new Device("Smartphone", 2018, 10999, "Red", 'b'),
                new Device("TV", 2020, 35999, "Black", 'a'),
                new Device("Mouse", 2008, 450, "Green", 'c'),
                new Device("Keyboard", 2017, 1350, "Silver", 'a'),
                new Device("Watch", 2023, 5600, "Gold", 'b'),
                new Device("iPad", 2017, 17899, "Silver", 'a'),
                new Device("Console", 2018, 700, "Black", 'c'),
                new Device("Lamp", 2024, 250, "Red", 'd'),
                new Device("Vape", 2008, 700, "Green", 'c'),
        };
    }

}
