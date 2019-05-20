package cz.sledovanitv.java.course.beginners;

import cz.sledovanitv.java.course.beginners.animal.Dragon;

public class GenericClass {

    public static <MyDragonType extends Dragon> MyDragonType createDragon(Class<MyDragonType> dragonClass) {
        try {
            return dragonClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ClassCastException("Cannot create class " + dragonClass.getSimpleName());
        }
    }

}
