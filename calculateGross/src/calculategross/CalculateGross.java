/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculategross;

/**Mabala Makhakhe
 *21/03/2022
 * @author Mabala
 */
public class CalculateGross {

    /**
     *
     * @param hours
     */
    public static void calculateGross(double hours)
{
    final double STD_RATE = 13.75;
    double gross;
    gross = hours * STD_RATE;
    System.out.println(hours + " hours at $" + STD_RATE + " per hours is $" + gross);
            
}
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
