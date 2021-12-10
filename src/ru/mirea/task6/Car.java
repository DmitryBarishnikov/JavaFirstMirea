package ru.mirea.task6;

public class Car implements Priceable{
    public int price;
    public Car(int price){
        this.price=price;
    }
    @Override
    public void getPrice(){
        System.out.println("Price car is " + this.price + " rub");
    }
}
