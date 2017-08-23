package com.generics;

public class Box<T> {

    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + this.obj.getClass().getSimpleName());
        System.out.println("U: " + u.getClass().getSimpleName());

    }
}
