package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        System.out.println(Divide(5,0));
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        studentFiles.forEach((key, value) -> {
            System.out.println(key + " - " + CheckFileExtension(value));
        });
    }

    public static double Divide(int x, int y){
        if ( y == 0 ) {
            try {
                throw new ArithmeticException("Cannot divide by zero");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } else {
            return ((double) x/(double) y);
        }
        return 0;
    }

    public static int CheckFileExtension(String fileName){
        if ( fileName.isEmpty() ) {
            try {
                throw new RuntimeException("No file submitted");
            } catch (RuntimeException e) {
                e.printStackTrace();
                return -1;
            }
        } else if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
}