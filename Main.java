package com.company;
import javax.xml.validation.Schema;
import java.util.Scanner;

class FormulaException extends Exception{
    private double number;

    public double getNumber() {
        return number;
    }
    public FormulaException(String message,double num){
        super(message);
        this.number = num;
    }
}

class Formula {
    public static double solveTheFormula(double x, double y) throws FormulaException{
            double z = 0;
            if(y == -1){
                throw new FormulaException("The divisor is 0", y);
            }
            z = (x + y) / (y + 1);
            return z;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = in.nextDouble();
        System.out.print("Введите y: ");
        double y = in.nextDouble();
        try{
            System.out.printf("%.2f", Formula.solveTheFormula(x, y));
        }
        catch (FormulaException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }
}