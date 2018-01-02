package com.generics;

import java.math.BigInteger;

public class BoxTwo<T> {

    private T obj;

    public T getObj() {
        return this.obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    // bounded type parameter
    // Using the U type inside the scope of inspect() method
    // adding bounds to it
    public <U extends Number> void inspect(U u) {
        System.out.println(this.obj.getClass().getName());
        System.out.println(u.getClass().getName());
    }
}
