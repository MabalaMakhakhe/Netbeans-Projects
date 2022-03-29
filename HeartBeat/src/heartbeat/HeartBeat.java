/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heartbeat;
import it.*;
import java.awt.*;
/**Mabala Makhakhe
 *3/13/2022
 * @author Mabala
 */
public class HeartBeat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gogga.setGridSize(20,10);
        Gogga heart=new Gogga();
        heart.setColor(Color.blue);
        heart.setPosition(1,9);
        heart.move();
        heart.setDirection(Gogga.RIGHT);
        heart.move();
        heart.turnLeft();
        heart.move();
        heart.turnRight();
        heart.move();
        heart.turnLeft();
        heart.move();
        heart.turnRight();
        heart.move();
        heart.turnLeft();
        heart.move();
        heart.turnRight();
        heart.move();
        heart.turnLeft();
        heart.move();
        heart.turnRight();
        heart.move();
    }
    
}
