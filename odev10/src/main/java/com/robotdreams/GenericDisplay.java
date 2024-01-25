package com.robotdreams;

public class GenericDisplay<T,U> {

    private final T obj1;
    private final U obj2;

    public GenericDisplay(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
    @Override
    public String toString() {
        return "GenericDisplay{" +
                "obj1=" + obj1 +
                ", obj2=" + obj2 +
                '}';
    }
}
