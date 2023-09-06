package org.launchcode;

public class ByThrees implements Series{
    private int val;

    public ByThrees() {
        this.val = 0;
    }

    @Override
    public int getNext() {
        val = val + 3;
        return val;
    }
}
