package cz.sledovanitv.java.course.beginners.animal;

public class SpikedDragon extends Dragon {

    public SpikedDragon() {
        setNumberOfEyes(4);
        numberOfLegs = 8;
    }

    public int getNumberOfWings() {
        return 4;
    }

    public void breathe() {
        System.out.println("Breathing fire everywhere ...");
    }
}
