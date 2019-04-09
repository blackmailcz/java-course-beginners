package cz.sledovanitv.java.course.beginners;

import cz.sledovanitv.java.course.beginners.animal.Cat;

public class Example3 {

    public static void main(String[] args) {
        String whiteColor = "white";
        Cat cat = new Cat(whiteColor);
        cat.meow();
        cat.setColorString("ginger");
        System.out.println("The cat is " + cat.getColorString());
        System.out.println("The cat is ginger");
        String color = cat.getColorString();
        System.out.println("The cat is " + color);
        cat.setColorString("black");
        System.out.println("The cat is " + cat.getColorString());
        System.out.println("The old color is " + color);
        cat.setColorString(color);
        System.out.println("Our cat is " + cat.getColorString() + " again!");
        Cat devil = new Cat("red");
        //cat = new Cat("red");
        System.out.println("The devil is "+devil.getColorString());
        System.out.println("We have two cats. First is "+cat.getColorString()+ " and second is "+
            devil.getColorString());
    }

}