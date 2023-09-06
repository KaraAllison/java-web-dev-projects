package org.launchcode;

public class ByTwos implements Series{
    private int val;

    public ByTwos() {
        this.val = 0;
    }

    @Override
    public int getNext() {
        if (val >= MAX) {
            return val;
        }
        val = val + 2;
        return val;
    }
}
