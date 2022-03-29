/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percentages;

/**
 *
 * @author Mabala
 */
public class Percentages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1 = 4.8;
        double num2 = 8.4;
        computePercent(num1, num2);
        computePercent(num2, num1);
    }
    public static void computePercent(double number1,double number2)
    {
      double percentage;
      double percentage2;
      percentage = (number1 / number2)* 100;
      System.out.println(number1 + " is " + percentage + " percent of " + number2);
      

              
    }
}
