package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Test");
        Menu myMenu = new Menu(new Date(),new ArrayList<MenuItem>(Arrays.asList(
                new MenuItem(4.75, "Chocolate shake", "Desserts", false),
                new MenuItem(5.50, "Chicken Tenders", "Chicken", false))));
        MenuItem myMenuItem = new MenuItem(6.50,"Bacon burger","Burgers", true);
        myMenu.addItem(myMenuItem);
        System.out.println(myMenu.toString());
        myMenu.addItem(myMenuItem);
        System.out.println(myMenuItem.toString());
        myMenu.removeItem(myMenuItem);
        System.out.println(myMenu.toString());
    }
}
