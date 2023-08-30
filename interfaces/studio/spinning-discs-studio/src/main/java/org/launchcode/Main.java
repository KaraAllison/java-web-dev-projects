package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCD = new CD();
        DVD myDVD = new DVD();

        myCD.spinDisc();
        myCD.readDisc();
        myCD.writeDisc("Summer Mix", 700, "Favorite songs from summer '09");
        myCD.readDisc();

        myDVD.spinDisc();
        myDVD.readDisc();
        myDVD.writeDisc("Lord of the Rings", 5, "movie");
        myDVD.readDisc();

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}