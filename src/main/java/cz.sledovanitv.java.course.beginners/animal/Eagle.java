package cz.sledovanitv.java.course.beginners.animal;

public class Eagle extends Bird {

    @Override
    public void speak() {
        System.out.println("Kra kra kra!");
    }

    @Override
    public void breathe() {
        System.out.println("Eagle is about to breathe");
        super.breathe();
        System.out.println("Eagle took a deep breath");
    }

    @Override
    public String toString() {
        return super.toString() + ": Eagle";
    }
}
