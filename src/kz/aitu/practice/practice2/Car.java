package kz.aitu.practice.practice2;

public class Car {
    int numpassenger;
    private int capacity;

    public Car(int capacity,int numpassenger) {

        this.capacity = capacity;
        this.numpassenger=numpassenger;
    }

    public int getCapacity() {
        return capacity;
    }
    public int getNumpassenger(){
        return numpassenger;

    }
}
