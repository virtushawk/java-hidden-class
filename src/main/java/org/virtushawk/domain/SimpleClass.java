package org.virtushawk;

public class SimpleClass {

    private int counter;

    public SimpleClass(int counter) {
        this.counter = counter;
    }

    public boolean isPublicMethod(boolean flag, boolean flag2) {
        return counter > 0 ? flag2: flag;
    }

    public boolean isPrivateMethod(boolean flag, boolean flag2) {
        return counter > 0 ? flag2: flag;
    }

}
