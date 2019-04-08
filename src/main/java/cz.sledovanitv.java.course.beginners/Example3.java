package cz.sledovanitv.java.course.beginners;

public class Example3 {

    public static void main(String[] args) {
        String whiteColor = "white";
        Cat cat = new Cat(whiteColor);
        cat.meow();
        cat.setColor("ginger");
        System.out.println("The cat is " + cat.getColor());
        System.out.println("The cat is ginger");
        String color = cat.getColor();
        System.out.println("The cat is " + color);
        cat.setColor("black");
        System.out.println("The cat is " + cat.getColor());
        System.out.println("The old color is " + color);
        cat.setColor(color);
        System.out.println("Our cat is " + cat.getColor() + " again!");
        Cat devil = new Cat("red");
        //cat = new Cat("red");
        System.out.println("The devil is "+devil.getColor());
        System.out.println("We have two cats. First is "+cat.getColor()+ " and second is "+
            devil.getColor());
    }

}