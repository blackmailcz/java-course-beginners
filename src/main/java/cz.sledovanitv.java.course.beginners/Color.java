package cz.sledovanitv.java.course.beginners;

public enum Color {
    WHITE("White"),
    GINGER("Damn lot ginger"),
    RED("Red as devil"),
    SPOTTED("With Red & White spots"),
    BLUE("Blue as sky");

    private String color;

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}