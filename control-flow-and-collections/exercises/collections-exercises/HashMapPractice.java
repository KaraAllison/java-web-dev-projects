import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int newID;
        String newStudent;
        String temp = "blank";

        System.out.println("Enter your students (or ENTER to finish):");
        while (true) {
            System.out.print("Student ID number: ");
            try {
                newID = input.nextInt();
            } catch (Exception e) {
                temp = input.nextLine();
                continue;
            }
            if (temp.equals("")) {
                break;
            }
            input.nextLine();
            do {
                System.out.print("Student name: ");
                newStudent = input.nextLine();
            } while (newStudent.equals(""));
            students.put(newID,newStudent);
        }
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer,String> student : students.entrySet()) {
            System.out.println(student.getValue() + " (" + student.getKey() + ")");
        }
    }
}
