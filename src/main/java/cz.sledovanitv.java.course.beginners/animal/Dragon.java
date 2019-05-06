package cz.sledovanitv.java.course.beginners.animal;

import cz.sledovanitv.java.course.beginners.Flying;

import java.util.Objects;

public abstract class Dragon extends Animal implements Flying, Comparable<Dragon> {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dragon)) return false;
        Dragon dragon = (Dragon) o;
        return numberOfEyes == dragon.numberOfEyes &&
            numberOfLegs == dragon.numberOfLegs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfEyes, numberOfLegs);
    }

    public int compareTo(Dragon dragon) {
        int legsComparison = Integer.compare(numberOfLegs, dragon.numberOfLegs);
        if (legsComparison == 0) {
            return Integer.compare(numberOfEyes, dragon.numberOfEyes);
        } else {
            return legsComparison;
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " with " + numberOfLegs + " legs and " + numberOfEyes + " eyes";
    }
}