
package gameextention2;
import javax.swing.JOptionPane;
/**
 *
 * @author Mabala
 */
public class GameExtention2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showInputDialog("Think of a number between 1 and 10");
        JOptionPane.showMessageDialog(null, "The number is " + (1 + (int)(Math.random() * 10)));
    }
    
}
