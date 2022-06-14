package app.core;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Box abc = new Box();
        abc.setContent("This is a string");
        
        Box xyz = new Box();
        xyz.setContent(3);

        //? What is the type?
        xyz.getContent();

        //? Call the class method
        // Utils.printBox(abc);
        // Utils.printBox(xyz);

        //? Generic way of specifying the type in the params
        // BoxG<Integer> bInt = new BoxG<Integer>();
        // BoxG<String> bStr = new BoxG<String>();
        // // BoxG<List<String>> bListStr = new BoxG<List<String>>();
        // // BoxG<List<Float>> bBoxStr = new BoxG<BoxG<Float>>();

        // bInt.setContent(123);
        // String BoxContent = (String) BoxG.getContent();
        // System.out.printf(BoxContent);


    }
}
