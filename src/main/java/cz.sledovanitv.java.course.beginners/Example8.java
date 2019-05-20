package cz.sledovanitv.java.course.beginners;

import cz.sledovanitv.java.course.beginners.animal.Dragon;
import cz.sledovanitv.java.course.beginners.animal.WoundedDragon;

public class Example8 {

    public static void main(String[] args) {
        Dragon dragon = GenericClass.createDragon(WoundedDragon.class);
        WoundedDragon woundedDragon = (WoundedDragon) dragon;
        System.out.println(dragon);

        Singleton.get().setNumber(10);
        System.out.println(Singleton.get().getNumber());

        Singleton.get().setNumber(5);
        System.out.println(Singleton.get().getNumber());

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append("A").append("B").append("C").toString());
    }

}
