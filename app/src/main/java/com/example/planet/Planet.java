package com.example.planet;

public class Planet {
    private String name;
    private Integer size;
    private Integer orbit;
    private Double howFarIsItFromEarth;

    public Planet() {
    }

    public Planet(String name, Integer size, Integer orbit, Double howFarIsItFromEarth) {
        this.name = name;
        this.size = size;
        this.orbit = orbit;
        this.howFarIsItFromEarth = howFarIsItFromEarth;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", orbit=" + orbit +
                ", howFarIsItFromEarth=" + howFarIsItFromEarth +
                '}';
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setOrbit(Integer orbit) {
        this.orbit = orbit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHowFarIsItFromEarth(Double howFarIsItFromEarth) {
        this.howFarIsItFromEarth = howFarIsItFromEarth;
    }

    public Double getHowFarIsItFromEarth() {
        return howFarIsItFromEarth;
    }

    public Integer getOrbit() {
        return orbit;
    }

    public Integer getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
