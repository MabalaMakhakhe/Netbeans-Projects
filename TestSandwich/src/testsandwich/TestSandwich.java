/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsandwich;

/**
 *
 * @author Mabala
 */
public class TestSandwich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.setMainIngredient("tuna");
        sandwich.setBread("wheat");
        sandwich.setPrice(4.99);
        System.out.println("You have ordered a " + sandwich.getMainIngredient() + " sandwich on " + sandwich.getBread() + " bread, and the price is " + sandwich.getPrice());
    }
    
}
