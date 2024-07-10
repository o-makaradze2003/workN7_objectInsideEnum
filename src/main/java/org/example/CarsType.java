package org.example;

public enum CarsType {
    sedan("cClass"),
    coupe("eClass"),
    jeep("GLEclass");

    private final String carModelName;

    CarsType(String carModelName) {
        this.carModelName = carModelName;
    }

    public String getCarMOdelName() {
        return carModelName;
    }

}
