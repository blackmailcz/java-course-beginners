package cz.sledovanitv.java.course.beginners;

public class Singleton {

    private static Singleton instance = null;

    public static Singleton get() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton() {
    }

    private int number = 0;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}