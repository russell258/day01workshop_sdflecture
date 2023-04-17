package sg.edu.nus.iss;
import java.util.Scanner;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        //Console con = System.console();
        List<String> shoppingCart = new ArrayList<>();
        //String input = "";
        String command = "";
        String item = "";
        System.out.println("Welcome to your shopping cart");
        while (!command.equals("quit")){
            command = scan.next();
            item = scan.nextLine();
            // log see what command and item is scanning first
            // command and item needs to be lowercased while item will need to be cleared of whitespace.
            // print the command and item action
            // if condition for "list" command to show empty OR the list with if loop
            // if condition for "add" command to add to the list --> DUPLICATES ARE NOT ADDED.
            // if condition for "delete" command --> error message for incorrect item index, if specified number greater than array length

            System.out.println("command is "+command + " & item is "+item);
        }





        scan.close();
    }
}
