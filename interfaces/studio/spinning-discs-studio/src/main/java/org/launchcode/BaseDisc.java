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

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private double getCapacity() {
        return capacity;
    }

    private void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    private String getContents() {
        return contents;
    }

    private void setContents(String contents) {
        this.contents = contents;
    }

    private String getType() {
        return type;
    }
}
