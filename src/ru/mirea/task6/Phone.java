package ru.mirea.task6;

public class Phone implements Priceable{
    public int price;
    public Phone(int price){
        this.price=price;
    }
    @Override
    public void getPrice(){
        System.out.println("Price phone is " + this.price + " rub");
    }
}
