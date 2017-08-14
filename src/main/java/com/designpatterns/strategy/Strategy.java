package com.designpatterns.strategy;

import java.io.Serializable;

public class Strategy {

    public static void main(String args[]) {
        CalculateClient client = new CalculateClient(new Minus());
        System.out.println("Minus: " + client.Calculate(7, 1));

        // Change the strategy
        client.setStrategy(new Plus());
        System.out.println("Plus: " + client.Calculate(7, 1));
    }
}

//The client
class CalculateClient {
    public ICalculate Strategy;

    public void setStrategy(ICalculate strategy) {
        this.Strategy = strategy;
    }

    public CalculateClient(ICalculate strategy) {
        Strategy = strategy;
    }

    //Executes the strategy
    public int Calculate(int value1, int value2) {
        return Strategy.Calculate(value1, value2);
    }
}

//The interface for the strategies
interface ICalculate {
    int Calculate(int value1, int value2); // algorithm
}

//strategies
//Strategy 1: Minus
class Minus implements ICalculate {
    public int Calculate(int value1, int value2) {
        return value1 - value2;
    }
}

//Strategy 2: Plus
class Plus implements ICalculate {
    public int Calculate(int value1, int value2) {
        return value1 + value2;
    }
}