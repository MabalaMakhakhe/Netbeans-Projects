/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberdemo3;

/**Mabala Makhakhe
 *27/03/2022
 * @author Mabala
 */
public class NumberDemo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1 = 5;
       int num2 = 7;
       displayTwiceTheNumber(num1);
       displayTwiceTheNumber(num2);
       displayNumberPlusFive(num1);
       displayNumberPlusFive(num2);
       displayNumberSquared(num1);
       displayNumberSquared(num2);
             
    }
    public static void displayTwiceTheNumber(int number)
    {
        final int FACTOR = 2;
        System.out.println(number + " times " + FACTOR + " is " + ( number * FACTOR));
    }
    public static void displayNumberPlusFive(int number)
    {
        final int FACTOR = 5;
        System.out.println(number + " plus " + FACTOR + " is " + ( number + FACTOR) );
    }
    public static void displayNumberSquared(int number)
    {
        System.out.println(number + " to the square root is " + ( number * number));
    }
}
