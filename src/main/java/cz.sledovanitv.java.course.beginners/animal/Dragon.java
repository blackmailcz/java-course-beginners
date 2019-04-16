package cz.sledovanitv.java.course.beginners.animal;

import cz.sledovanitv.java.course.beginners.Flying;

public abstract class Dragon extends Animal implements Flying {

    private int numberOfEyes = 2;
    protected int numberOfLegs = 4;

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    protected void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    private void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

}