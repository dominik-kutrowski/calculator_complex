package com.industry.math;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberChecker {

    Exception exception;
    Double StringIsDouble;

    public Double CheckIsDouble(String addInfo){
        Scanner LineReader = new Scanner(System.in);
        switch (addInfo) {
            case "real":
                System.out.print("Complex: real part     : ");
                CheckIsDouble();
                break;
            case "imaginary":
                System.out.print("Complex: imaginary part: ");
                CheckIsDouble();
                break;
            default:
                System.out.print("Liczba : ");
                CheckIsDouble();
                break;
        }
        return StringIsDouble;
    }

    private Double CheckIsDouble(){
        Scanner LineReader = new Scanner(System.in);
        do {
            exception = null;
            try {
                StringIsDouble = LineReader.nextDouble();
            } catch (InputMismatchException e) {
                LineReader.next();
                exception = e;
            }
        } while (exception != null);
        return StringIsDouble;
    }
}
