package org.launchcode;

public class Main {
    public static void main(String[] args) {
        ByTwos myTwo = new ByTwos();
        ByThrees myThree = new ByThrees();
        System.out.println("Two || Three");
        for (int i = 0; i < 5; i ++) {
            System.out.println(myTwo.getNext() + "  ||  " + myThree.getNext());
        }
        myTwo.printMax();
    }
}
