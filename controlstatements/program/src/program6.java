<<<<<<< HEAD
import java.util.*;
public class Program6 {

  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        String input = in.next();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;   
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;    
        
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u") || input.equals("A") || input.equals("E") || input.equals("I") || input.equals("O") || input.equals("U");

        if (input.length() > 1)
        {
            System.out.println("Input is not a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Input is not a letter.");
        }
        else if (vowels)
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
=======
import java.util.*;
public class Program6 {

  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        String input = in.next();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;   
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;    
        
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u") || input.equals("A") || input.equals("E") || input.equals("I") || input.equals("O") || input.equals("U");

        if (input.length() > 1)
        {
            System.out.println("Input is not a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Input is not a letter.");
        }
        else if (vowels)
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
>>>>>>> 99f50be807b5c44153a0e442abd13cb01ec42434
}