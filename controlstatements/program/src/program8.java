<<<<<<< HEAD
import java.util.*;
public class Program8 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int count;
        int count2;
        char ch;
        do {
            System.out.print("Input the number : ");
            int no = input.nextInt();  
            count = 1;
            count2 = 1;
            ch = 'A';
            for (int i=1; i < (no*2); i++) 
            {
                for (int spc=no-count2; spc>0; spc--)   
                {
                    System.out.print(" ");  
                }
                if (i < no) 
                {
                    count2++;
                } 
                else 
                {
                    count2--;
                }
                for (int j=0; j<count; j++) 
                {
                    System.out.print(ch);    
                    if (j < count/2) 
                    {
                        ch++;
                    } 
                    else 
                    {
                        ch--;
                    }
                }
                if (i<no)
                {
                    count = count+2;
                } 
                else
                {
                    count = count-2;
                }
                ch = 'A';

                System.out.println();
            }
            System.out.print("Press Q to EXIT else any key to continue :");
            ch = input.next().charAt(0);
            if ((ch == 'Q') || (ch == 'q'))
            {
                break;
            }
        } while (true);
    }
=======
import java.util.*;
public class Program8 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int count;
        int count2;
        char ch;
        do {
            System.out.print("Input the number : ");
            int no = input.nextInt();  
            count = 1;
            count2 = 1;
            ch = 'A';
            for (int i=1; i < (no*2); i++) 
            {
                for (int spc=no-count2; spc>0; spc--)   
                {
                    System.out.print(" ");  
                }
                if (i < no) 
                {
                    count2++;
                } 
                else 
                {
                    count2--;
                }
                for (int j=0; j<count; j++) 
                {
                    System.out.print(ch);    
                    if (j < count/2) 
                    {
                        ch++;
                    } 
                    else 
                    {
                        ch--;
                    }
                }
                if (i<no)
                {
                    count = count+2;
                } 
                else
                {
                    count = count-2;
                }
                ch = 'A';

                System.out.println();
            }
            System.out.print("Press Q to EXIT else any key to continue :");
            ch = input.next().charAt(0);
            if ((ch == 'Q') || (ch == 'q'))
            {
                break;
            }
        } while (true);
    }
>>>>>>> 99f50be807b5c44153a0e442abd13cb01ec42434
}