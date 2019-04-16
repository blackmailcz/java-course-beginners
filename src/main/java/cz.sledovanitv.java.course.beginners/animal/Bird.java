package cz.sledovanitv.java.course.beginners.animal;

import cz.sledovanitv.java.course.beginners.Speakable;

public class Bird extends Animal implements Speakable {

    public void speak() {
        System.out.println("La la la");
    }

    @Override
    public String toString() {
        return super.toString() + ": Bird";
    }

    public void breathe() {
        System.out.println("Taking a deep breath . . .");
    }

}
