package com.industry.math;

public class Complex {

    private Double real;
    private Double imaginary;

    public Complex (Double realPart, Double imaginaryPart) {
        this.real = realPart;
        this.imaginary = imaginaryPart;
    }

    public Double getReal() {
        return real;
    }

    public Double getImaginary() {
        return imaginary;
    }
}
