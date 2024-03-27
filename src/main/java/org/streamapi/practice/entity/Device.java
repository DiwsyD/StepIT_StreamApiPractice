package org.streamapi.practice.entity;

public class Device {

    private final String name;
    private final int releaseAge;
    private final int price;
    private final String color;
    private final char type;

    public Device(String name, int releaseAge, int price, String color, char type) {
        this.name = name;
        this.releaseAge = releaseAge;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getReleaseAge() {
        return releaseAge;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public char getType() {
        return type;
    }
}
