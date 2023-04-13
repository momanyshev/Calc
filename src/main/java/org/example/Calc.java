package org.example;

public class Calc {
    public int plus(int a, int b){
        int result = a + b;
        System.out.println("При сложении " + a + " и " + b + " получается " + result);
        return result;
    }

    public int minus(int a, int b){
        int result = a - b;
        System.out.println("При вычитании из числа " + a + " числа " + b + " получается " + result);
        return result;
    }


}
