package lv.javaguru.OOP.InheritanceTask;

public class Bus extends Car {
    private int seatNumber;

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", seatNumber= " + seatNumber;
    }
}
