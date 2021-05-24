package javaCalculator;

public class Calc {
   
    public static Integer add(int num1, int num2) {
        Integer answer = num1 + num2;
        return answer;
    }
   
    public static Integer subtract( int num1, int num2) {
        Integer answer = num1 - num2;
        return answer;
    }

    public static Integer multiply(int num1, int num2) {
        Integer answer = num1 * num2;
        return answer;
    }
 
    public static float divide(int num1, int num2) {
        float answer = num1/num2;
        return answer;
    }
 
    public static Integer square(int num1) {
        Integer answer = num1*num1;
        return answer;
    }
}
