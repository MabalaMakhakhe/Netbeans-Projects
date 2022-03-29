/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demogrosspay;

/**
 *
 * @author Mabala
 */
public class DemoGrossPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
 double hours = 25;
 double yourHoursWorked = 37.5;
 calculateGross(10);
 calculateGross(hours);
 calculateGross(yourHoursWorked);
 }
 public static void calculateGross(double hours)
 {
 final double STD_RATE = 13.75;
 double gross;
 gross = hours * STD_RATE;
 System.out.println(hours + " hours at $" + 
 STD_RATE + " per hour is $" + gross);
 }
    }
    
