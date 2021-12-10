package ru.mirea.task6;

public class TestPrice {
    public static void main(String[] args){
        Car car = new Car(5000000);
        Phone phone = new Phone(130000);
        car.getPrice();
        phone.getPrice();
    }
}
