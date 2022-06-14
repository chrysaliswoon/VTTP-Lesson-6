package app.core;

public class Utils {
    public static void printBox(Box b) {
        //? What is this content?
        Object value = b.getContent();

        if (value instanceof String) {
            System.out.println("This is a string");
        }  else if (value instanceof Integer) {
            System.out.println("This is an integer");
        } else {
            System.out.println("Unable to identify type");
        }

    }
}
