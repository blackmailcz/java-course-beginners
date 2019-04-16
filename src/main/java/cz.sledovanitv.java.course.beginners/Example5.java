package cz.sledovanitv.java.course.beginners;

import cz.sledovanitv.java.course.beginners.animal.*;

public class Example5 {

    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println(bird);
        Bird eagle = new Eagle();
        System.out.println(eagle);
        eagle.speak();
        Object something = eagle;
        if (eagle instanceof Animal) {
            System.out.println("Eagle is Animal");
        }
        if (eagle instanceof Bird) {
            System.out.println("Eagle is Bird");
        }
        if (eagle instanceof Eagle) {
            System.out.println("Eagle is Eagle");
        }
        if (something instanceof Cat) { // Negation: !(something instance of Cat)
            System.out.println("Eagle is Cat");
        } else {
            System.out.println("Eagle is not a Cat");
        }
        eagle.breathe();
        Animal someStrangeAnimal = new Animal() {
            public void breathe() {
                System.out.println("A strange animal is breathing..");
            }

            @Override
            public String toString() {
                return super.toString() + ": Weird creature";
            }
        };
        someStrangeAnimal.breathe();
        System.out.println(someStrangeAnimal);

        SpikedDragon spikedDragon = new SpikedDragon();
        System.out.println("This dragon has "+spikedDragon.getNumberOfEyes()+" eyes");
        System.out.println("This dragon has "+spikedDragon.getNumberOfLegs()+" legs");
    }
}
