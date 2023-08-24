package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }
    public void addItem(MenuItem item) {
        boolean flag = false;
        for (MenuItem i : this.items) {
            if (i.equals(item)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Item already exists in menu");
        } else {
            this.items.add(item);
            this.lastUpdated = new Date();
        }
    }
    public void removeItem(MenuItem item) {
        for (MenuItem i : this.items) {
            if (i.equals(item)) {
                this.items.remove(i);
                this.lastUpdated = new Date();
                break;
            }
        }
    }
    @Override
    public String toString() {
        String str = "";
        for (MenuItem item : this.items) {
            str = str.concat(item.toString());
        }
        return str;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
}


