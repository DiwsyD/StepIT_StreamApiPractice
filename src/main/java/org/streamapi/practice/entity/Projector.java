package org.streamapi.practice.entity;

public class Projector {

    private final String name;
    private final int releaseAge;
    private final String manufacturer;

    public Projector(String name, int releaseAge, String manufacturer) {
        this.name = name;
        this.releaseAge = releaseAge;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public int getReleaseAge() {
        return releaseAge;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
