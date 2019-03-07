package com.industry.math;

//import java.time.*;
import com.industry.math.Complex;

public class Calculator {

    private Double x;
    private Double y;
    /*private LocalTime timePoint;
    private LocalDate datePoint;*/

    public Calculator() {
    }

    public Double add(Double x, Double y){ return x+y; }
    public Double sub(Double x, Double y){ return x-y; }
    public Double mul(Double x, Double y){ return x*y; }
    public Double div(Double x, Double y){ return x/y; }

    public String addComplex(Complex complexInput1, Complex complexInput2){
        x = complexInput1.getReal() + complexInput2.getReal();
        y = complexInput1.getImaginary() + complexInput2.getImaginary();
        return ComplexOnScreen(x, y);
    }
    public String subComplex(Complex complexInput1, Complex complexInput2){
        return ComplexOnScreen(
                complexInput1.getReal() - complexInput2.getReal(),
                complexInput1.getImaginary() - complexInput2.getImaginary());
    }
    public String mulComplex(Complex complexInput1, Complex complexInput2){
        return ComplexOnScreen(
                complexInput1.getReal()*complexInput2.getReal()-complexInput1.getImaginary()*complexInput2.getImaginary(),
                complexInput2.getReal()*complexInput1.getImaginary()+complexInput1.getReal()*complexInput2.getImaginary());
    }

    private String ComplexOnScreen(Double x, Double y){
        String ComplexOutput;
        if(y>=0)ComplexOutput = String.valueOf(x) + "+" + String.valueOf(y) + "i";
        else ComplexOutput = String.valueOf(x) + String.valueOf(y) + "i";
        return ComplexOutput;
    }

    public void info() {
        System.out.println("\n");
        System.out.println("Dziś jest: 2019.01.18");
        System.out.println("\n");
        System.out.println("Jestem klasą: kalkólutator, wersja z błedami, ortograficznymi");
        System.out.println("Lepszą nie będę, jakkolwiek, będę próbowała :)");
        System.out.println("\n");
    }
}
