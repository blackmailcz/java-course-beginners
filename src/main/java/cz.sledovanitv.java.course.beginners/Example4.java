package cz.sledovanitv.java.course.beginners;

import cz.sledovanitv.java.course.beginners.animal.Bird;
import cz.sledovanitv.java.course.beginners.animal.Cat;

public class Example4 {

    public static void main(String[] args) {
        Cat.printCatCount();
        Color color = Color.SPOTTED;
        System.out.println("Spotted color " + color.toString());
        Cat spottedCat = new Cat(Color.SPOTTED);
        Cat.printCatCount();
        System.out.println(spottedCat.getColor());
        if (spottedCat.getColor() == Color.WHITE) {
            System.out.println("The cat is "+Color.WHITE);
        } else {
            System.out.println("The cat is not "+Color.WHITE+", it is "+spottedCat.getColor());
        }
        Cat snowball = new Cat(Color.BLUE);
        Cat.printCatCount();
        snowball.speak();
        Speakable animal = createCat();
        animal.speak();
        animal = createBird();
        animal.speak();
    }

    public static Speakable createCat() {
        return new Cat(Color.RED);
    }

    public static Speakable createBird() {
        return new Bird();
    }

}