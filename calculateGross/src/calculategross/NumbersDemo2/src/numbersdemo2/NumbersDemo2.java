/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersdemo2;

/**Mabala Makhakhe
 *24/03/2022
 * @author Mabala
 */
public class NumbersDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        displayTwiceTheNumber(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num1);
        displayNumberPlusFive(num2);
        displayNumberSquared(num1);
        displayNumberSquared(num2);
                
    }
    public static void displayTwiceTheNumber(int f)
    {
       final int FACTOR = 2;
       System.out.println(f + " times " + FACTOR + " is " + (f * FACTOR));
       
    }
    public static void displayNumberPlusFive(int f)
    {
       final int FACTOR = 5;
       System.out.println(f + " plus " + FACTOR + " is " + (f + FACTOR));
       
    }
    public static void displayNumberSquared(int f)
    {
        System.out.println(f + " squared is " + (f * f));
    }
}
