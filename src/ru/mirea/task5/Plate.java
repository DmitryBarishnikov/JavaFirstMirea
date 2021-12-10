package ru.mirea.task5;

public class Plate extends Dish{
    private String size;
    public Plate(String color, String material, String size){
        super(color, material);
        this.size=size;
    }
    @Override
    public void info(){
        System.out.println("Dish:Plate"+ "color: " + super.getColor() + ", material: " +
                super.getMaterial() + ", size: " + this.size);
    }
}
