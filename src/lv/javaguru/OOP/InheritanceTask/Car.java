package lv.javaguru.OOP.InheritanceTask;

public class Car {
    private String brand;
    private String colour;
    private int year;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return "Car " + "brand=" + brand + ", colour= " + colour + ", year= " + year;
    }
}


