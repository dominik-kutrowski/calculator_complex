package com.industry.math;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // ctrl + alt + L

        Double liczba1 = 0.0;
        Double liczba2 = 0.0;

        Calculator calculator = new Calculator();
        NumberChecker CheckInput = new NumberChecker();

        calculator.info();

        //dane wejściowe:
        liczba1 = CheckInput.CheckIsDouble("real");
        liczba2 = CheckInput.CheckIsDouble("imaginary");
        Complex liczbaComplex1 = new Complex(liczba1, liczba2);
        System.out.println(" Complex number created! \n");

        liczba1 = CheckInput.CheckIsDouble("real");
        liczba2 = CheckInput.CheckIsDouble("imaginary");
        Complex liczbaComplex2 = new Complex(liczba1, liczba2);
        System.out.println(" Complex number created! \n");


        //obliczenia:
        System.out.printf("\n add complex: " + calculator.addComplex(liczbaComplex1, liczbaComplex2) + "\n");
        System.out.printf("\n sub complex: " + calculator.subComplex(liczbaComplex1, liczbaComplex2) + "\n");
        System.out.printf("\n mul complex: " + calculator.mulComplex(liczbaComplex1, liczbaComplex2) + "\n");
        System.out.printf("\n div complex: soon!");
        /*System.out.printf("\n add: " + calculator.add(liczba1, liczba2) + "\n");
        System.out.printf(" sub: " + calculator.sub(liczba1, liczba2) + "\n");
        System.out.printf(" mul: " + calculator.mul(liczba1, liczba2) + "\n");
        if (liczba2 != 0) System.out.printf(" div: " + calculator.div(liczba1, liczba2) + "\n");
        else System.out.printf(" div by 0 - maybe next time :)\n");
        */
    }
}
