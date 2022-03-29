
package getuserinfo;
import java.util.Scanner;

/**Mabala Makhakhe
 *20/03/2022
 * @author Mabala
 */
public class GetUserInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
{
 String name;
 int age;
 Scanner inputDevice = new Scanner(System.in);
 System.out.print("Please enter your age >> ");
 age = inputDevice.nextInt();
 inputDevice.nextLine();
 System.out.print("Please enter your name >> ");
 name = inputDevice.nextLine();
 System.out.println("Your name is " + name +
 " and you are " + age + " years old.");
    }
    }
}
