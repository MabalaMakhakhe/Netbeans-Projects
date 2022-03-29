/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoraise;

/**Mabala Makhakhe
 *21/03/2022
 * @author Mabala
 */
public class DemoRaise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salary = 200.00;
        double startingWage = 800.00;
        System.out.println("Demonstrating some raises");
        predictRaise(400.00);
        predictRaise(salary);
        predictRaise(startingWage);
    }
    public static void predictRaise(double salary)
    {
        double newSalary;
        final double RAISE_RATE= 1.10;
        newSalary = salary * RAISE_RATE;
        System.out.println("Current salary: " + salary + "    After raise: " + newSalary);
    }
}
