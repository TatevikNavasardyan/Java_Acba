package org.example.Car;

public class Vehicle {
    String make;
    String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    public String getDetails(){
        return "Make : "+getMake()+ ", Model : "+getModel();
    }
}
