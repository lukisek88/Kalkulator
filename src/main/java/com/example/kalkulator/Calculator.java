package com.example.kalkulator;




public class Calculator {

    public void add (int a , int b){
        int c = a +b;
        System.out.println(c);


    }
    public void subt(int a , int b){
        int c = a - b;
        System.out.println(c);

    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(10,5);
        calc.subt(10,5);

    }

}
