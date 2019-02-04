import java.io.*;
import java.util.*;
 class FileDemo2 { 
   
   public static void main(String[] args) {
      File f = null;
            try {
         
               f = new File("C:\\ARYANNCU\\JAVA_FOCPII\\filehandling\\program\\files\\file1.txt");
              FileWriter fout  = new FileWriter(f);
	      BufferedWriter bout= new BufferedWriter(fout);
 	      Scanner sc= new Scanner(System.in);
        System.out.println("Press N to exit");
        System.out.println("\nEnter a new String");
        do{
          bout.write(sc.nextLine());
          bout.newLine();
          char ch = sc.next().charAt(0);
          if(ch =='N')
            break;
        }while(sc.hasNext());
            bout.close();
			} 
		
		catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
     }
 } }

