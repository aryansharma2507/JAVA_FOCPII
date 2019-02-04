import java.lang.*;
import java.util.*;

class homework
{
   public static void main(String args[])
   { 
   		Scanner in = new Scanner(System.in);
   		System.out.println("1. ArithmeticException\n 2. ArrayIndexOutOfBoundsException\n 3. NumberFormatException\n 4. NullPointerException");
   		int menu = in.nextInt();
   		if(menu == 1){
   			 try{
         int num1=30, num2=0;
         int output=num1/num2;
         System.out.println ("Result: "+output);
      }
      catch(ArithmeticException e){
         System.out.println ("You Shouldn't divide a number by zero");
      }
   		}
   		if(menu == 2){
   						try{
        				int a[]=new int[10];
        
        					a[11] = 9;
      }
      catch(ArrayIndexOutOfBoundsException e){
        			 System.out.println ("ArrayIndexOutOfBounds");
      }
   		} 
   		if(menu == 3){
   			 try{
	 				int num=Integer.parseInt ("XYZ") ;
	 				System.out.println(num);
      }				catch(NumberFormatException e){
	  				System.out.println("Number format exception occurred");
       }
   		}
			if(menu == 4){
				 try{
	 					String str="beginnersbook";
	 					System.out.println(str.length());;
	 					char c = str.charAt(0);
						 c = str.charAt(40);
						 System.out.println(c);
						}catch(StringIndexOutOfBoundsException e){
	  						System.out.println("StringIndexOutOfBoundsException!!");
       }
			}
			 try{
	 String str="beginnersbook";
	 System.out.println(str.length());;
	 char c = str.charAt(0);
	 c = str.charAt(40);
	 System.out.println(c);
      }catch(StringIndexOutOfBoundsException e){
	  System.out.println("StringIndexOutOfBoundsException!!");
       }
       
		}
	}