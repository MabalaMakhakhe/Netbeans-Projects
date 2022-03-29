/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percentages2;
import java.util.Scanner;

/**Mabala Makhakhe
 *27/03/2022
 * @author Mabala
 */
public class Percentages2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1;
        double num2;
        Scanner values = new Scanner (System.in);
        System.out.print("Enter a double >> ");
        num1 = values.nextDouble();
        System.out.print("Enter another double >> ");
        num2 = values.nextDouble();
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
