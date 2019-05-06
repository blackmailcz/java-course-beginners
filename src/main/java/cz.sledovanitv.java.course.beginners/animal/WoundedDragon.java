package cz.sledovanitv.java.course.beginners.animal;

public class WoundedDragon extends Dragon {

    public WoundedDragon() {
        setNumberOfEyes(1);
    }

    @Override
    public int getNumberOfWings() {
        return 1;
    }

    @Override
    public void breathe() {

    }
}
