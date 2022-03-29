/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerdemointeractive;
import java.util.Scanner;

/**Mabala Makhakhe
 *20/03/2022
 * @author Mabala
 */
public class IntegerDemoInteractive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int anInt;
       byte aByte;
       short aShort;
       long aLong;
       String name;
               
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer >> ");
        anInt = input.nextInt();
        System.out.print("Please enter a byte integer >> ");
        aByte = input.nextByte();
        System.out.print("Please enter a short integer >> ");
        aShort = input.nextShort();
        System.out.print("Please enter a long integer >> ");
        aLong = input.nextLong();
        System.out.print("Please enter your name >> ");
        input.nextLine();
        name = input.nextLine();
        System.out.println("Thank you, " + name);
        
    }
    
}
