package ru.mirea.task5;

public class TestDish {
    public static void main(String[] args){
        Plate p = new Plate("White", "Glass", "Small");
        Wineglass g = new Wineglass("Clear", "Porcelain", 15);
        p.info();
        g.info();
    }
}
