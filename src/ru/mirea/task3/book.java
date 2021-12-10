package ru.mirea.task3;

public class book {
    private String name;
    private String author;
    public book(String name, String author) {
        this.name=name;
        this.author=author;
    }
public book(String name){
        this.name=name;
        this.author="unknow";
}
public  String getName(){
        return name;
}
public void setName(String name){
        this.name=name;
}
public String getAuthor(){
        return author;
}

    public void setAuthor(String author) {
        this.author = author;
    }
    public String toString(){
        return "Titel: " + this.name + " book by " + this.author;
    }
}
