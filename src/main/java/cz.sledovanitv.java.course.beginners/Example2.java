package cz.sledovanitv.java.course.beginners;

public class Example2 {

    /**
     * Example method with an attribute, printing the given text to the output.
     * @param text Attribute of type Object named text
     */
    private static void printText(Object text) {
        System.out.println(text);
    }

    /**
     * Main method - This is the starting point of the application
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        // Simple variable example
        String hello = "Hello World";
        System.out.println(hello);
        // The same variable can be re-assigned (used again)
        hello = "Ahoj světe!";
        System.out.println(hello);
        // Example of integer variable
        int count = 5;
        System.out.println(count);
        printText(5);
        printText(hello.length());
        // Example of null
        String nullVariable = null;
        //printText(nullVariable.length()); .. This will crash
        // Random number generation
        int randomNumber = (int) (Math.random() * 10);
        // Concatenation of strings (joining strings together)
        printText("Our random number is " + randomNumber);
        printText("This" + " " + "is" + " " + "a" + " " + "string" + "!");
        // Simple condition example
        if (randomNumber > 5) {
            // This will execute only if the condition is met.
            printText("Open a garage!");
        }
        if (randomNumber <= 5) {
            printText("Close a garage!");
        }
        // Example of 'else'
        if (randomNumber > 5) {
            printText("Open a window!");
        } else {
            // This will execute only if the condition is NOT met.
            printText("Close a window!");
        }
        // Example of 'else if'
        if (randomNumber < 3) {
            printText("Open a door");
        } else if (randomNumber >= 3 && randomNumber < 6) {
            // This will execute if the previous condition is not met.
            printText("Do nothing!");
        } else {
            // This will execute if none of the conditions are met.
            printText("Close a door");
        }
        printText("Oh, I found an apple tree! Let's collect them");
        // Example of 'for'
        for (int i = 0; i < 5; i++ /* It's the same as i = i + 1*/) {
            printText("I have " + i + " apples");
        }
        printText("Oh, I met a hungry caterpillar and she needs to feed");
        // Example of 'for' in the opposite direction. Example of nesting.
        for (int i = 4; i >= 0; i--) {
            printText("I have " + i + " apples");
            if (i > 2) {
                printText("I still have some apple");
            } else if (i <= 2 && i > 0) {
                printText("I am losing apples");
            } else if(i == 0) {
                printText("Well and I have nothing");
            }
        }
    }
}
