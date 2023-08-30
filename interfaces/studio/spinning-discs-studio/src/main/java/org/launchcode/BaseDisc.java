package org.launchcode;

public abstract class BaseDisc implements OpticalDisc{

    String name;
    double capacity;
    String contents;
    String type;
    String storageMeasure;

    public BaseDisc() {

    }
    public BaseDisc(String name, double capacity, String contents) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
    }

    @Override
    public void writeDisc(String name, double capacity, String contents) {
        setName(name);
        setCapacity(capacity);
        setContents(contents);
    }

    @Override
    public void readDisc() {
        System.out.println("Name: " + getName());
        System.out.println("Capacity: " + getCapacity() + " " + storageMeasure);
        System.out.println("Contents: " + getContents());
        System.out.println("Type: " + getType());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
