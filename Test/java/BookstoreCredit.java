import java.util.Scanner;
public class BookstoreCredit {

    public static void main(String args[]) {
        String name;        double gpa;
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Please enter your name >>> ");
        name = inputDevice.nextLine();        System.out.print("Please enter your grade point average >>> ");
        gpa = inputDevice.nextDouble();
        System.out.print(name);        System.out.print(", your GPA is ");
        System.out.print(gpa);
        System.out.print(", so your credit is " + computeDiscount(gpa));

    }

    public static double computeDiscount(double gpa) {
        double credit;
        credit = gpa * 10.0;
        return credit;
    }
}