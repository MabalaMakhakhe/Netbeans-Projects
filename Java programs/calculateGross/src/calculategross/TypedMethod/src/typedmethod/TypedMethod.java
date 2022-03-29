/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typedmethod;
import javax.swing.*;

/**Mabala Makhakhe
 *22/03/2022
 * @author Mabala
 */
public class TypedMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double newAmount;
        
        newAmount = predReward(400.00);
        System.out.println("The reward is: " + newAmount);
    }
    public static double predReward(double number)
    {
        double newAmount;
        final double REWARD = 1.10;
        newAmount = number * REWARD;
    
        return newAmount;
}
}
    
