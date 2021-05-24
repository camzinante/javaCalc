package javaCalculator;

public class Main {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 15;
        
        System.out.println(num1 + " added to " + num2 +" equals: " + Calc.add(num1,num2));

        System.out.println(num2 + " subtracted from " + num1 +" equals: " + Calc.subtract(num1,num2));

        System.out.println(num1 + " multiplied by " + num2 +" equals: " + Calc.multiply(num1,num2));

        System.out.println(num1 + " divided by " + num2 +" equals: " + Calc.divide(num1,num2));

        System.out.println(num1 + " squared equals: " + Calc.square(num1));

    
    }
}