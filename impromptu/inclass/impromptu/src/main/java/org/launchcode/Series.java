package org.launchcode;

public interface Series  {
    int MAX = 8;
    int getNext();

    default void printMax() {
        System.out.println(MAX);
    }
}
