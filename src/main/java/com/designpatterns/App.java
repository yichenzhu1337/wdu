package com.designpatterns;

class T {}

class S extends T {}



class Shape {
    Shape(T shape) { // instead of Shape(S shape)

    }
}

public class App {

    public static void main(String args[]) {

        Shape s1 = new Shape(new S());

    }

}
