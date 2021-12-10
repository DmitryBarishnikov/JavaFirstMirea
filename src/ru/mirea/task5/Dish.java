package ru.mirea.task5;

public abstract class Dish {
    private String color;
    private String material;
    public String getColor(){
    return color;
    }
    public String getMaterial(){
        return material;
    }
    public Dish(String color, String material){
        this.color=color;
        this.material=material;
    }
    public abstract void info();
}