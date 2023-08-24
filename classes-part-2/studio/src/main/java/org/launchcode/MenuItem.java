package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    @Override
    public String toString(){
        return String.format("%s from the %s category, price: $%.2f%s.\n", this.description,
                this.category, this.price, (this.isNew) ? " and is new to the menu" : "");
    }
    public boolean equals(MenuItem comp) {
        if (this == comp) {
            return true;
        }
        if (comp == null || this.getClass() != comp.getClass()) {
            return false;
        }
        return this.description.equals(comp.description);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}

