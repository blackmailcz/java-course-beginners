package cz.sledovanitv.java.course.beginners.animal;

import cz.sledovanitv.java.course.beginners.Color;
import cz.sledovanitv.java.course.beginners.Speakable;

public class Cat extends Animal implements Speakable {

    private String colorString = "white";
    private Color color = Color.WHITE;
    private static int counter = 0;

//    public Cat() {
//        this.colorString = "white";
//    }

//    public Cat() {
//        System.out.println("A new cat was born!");
//    }

    public Cat(String colorString) {
        setColorString(colorString);
        System.out.println("A new colored cat was born! It's " + colorString);
    }

    public Cat(Color color) {
        this.color = color;
        counter++; // counter = counter + 1
        System.out.println("A new colored cat was born! We have " + counter + " cat(s) total.");
    }

    public String getColorString() {
        return this.colorString;
    }

    public void setColorString(String colorString) {
        this.colorString = colorString;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static int getCatCount() {
        return counter;
    }

    public static void printCatCount() {
        String part;
        switch (counter) {
            case 0:
                part = "no cats";
                break; // Symbolizes }
            case 1:
                part = "one cat";
                break;
            default:
                part = counter + " cats";
        }
        System.out.println("I have " + part);
    }

    public void meow() {
        System.out.println("Meow!");
    }

    public void speak() {
        meow();
    }

    public void breathe() {
        System.out.println("A cat is sloooowly breathing...");
    }
}