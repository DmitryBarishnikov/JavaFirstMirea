package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args){
        Author a1= new Author("Baryshnikov Dmitry", "baryshnikovdmitry@gmail.com", 'M');
        Author a2= new Author("Egorova Ksenia", "egorovaksenia@gmail.com", 'F');
        System.out.println(a1);
        System.out.println(a2);
    }
}
