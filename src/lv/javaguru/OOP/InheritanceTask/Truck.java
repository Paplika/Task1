package lv.javaguru.OOP.InheritanceTask;

public class Truck extends Car {

    private int fullMass;

    public void setFullMass(int fullMass) {
        this.fullMass = fullMass;
    }

    @Override
    public String toString() {
        return super.toString() + ", fullMass= " + fullMass;
    }
}
