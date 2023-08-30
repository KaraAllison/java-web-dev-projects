package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD() {
        this.type = "DVD";
        this.storageMeasure = "GB";
    }
    public DVD(String name, double capacity, String contents) {
        super(name, capacity, contents);
        this.type = "DVD";
        this.storageMeasure = "GB";
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
