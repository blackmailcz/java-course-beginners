package cz.sledovanitv.java.course.beginners;

public class Cat {

    private String color = "white";

//    public Cat() {
//        this.color = "white";
//    }

//    public Cat() {
//        System.out.println("A new cat was born!");
//    }

    public Cat(String color) {
        setColor(color);
        System.out.println("A new colored cat was born! It's "+color);
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void meow() {
        System.out.println("Meow!");
    }

}