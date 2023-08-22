import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] intSet = {1,1,2,3,5,8};
        for (int i : intSet) {
            System.out.print(i + " ");
        }
        for (int i : intSet) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        String greenEggs = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them " +
                "in a house. I will not eat them with a mouse.";
        String[] ham = greenEggs.split(" ");
        System.out.println(Arrays.toString(ham));
        String[] sentences = greenEggs.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
