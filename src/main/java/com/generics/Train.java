package com.generics;

public class Train<T, U, V, W> {

    private String name;

    public Train(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
