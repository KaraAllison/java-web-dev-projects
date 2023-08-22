import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wordSize;
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);
        intList.add(9);
        intList.add(10);
        System.out.println(sumEven(intList));
        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them " +
                "in a house. I will not eat them with a mouse.";
        String[] strSplit = greenEggs.split("[( )(, )(. )]");
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strSplit));
        System.out.println("Enter the word length to search");
        while (true) {
            try {
                wordSize = input.nextInt();
            } catch (Exception e) {
                input.nextLine();
                continue;
            }
            if (wordSize > 0) {
                break;
            }
        }
        eachWord(strList,wordSize);

    }

    public static void eachWord(ArrayList<String> arr, int size) {
        for (String str : arr) {
            if (str.length() == size) {
                System.out.println(str);
            }
        }
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0 ) {
                total += integer;
            }
        }
        return total;
    }

}
