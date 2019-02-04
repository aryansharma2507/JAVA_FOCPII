import java.io.*;
import java.util.*;
 class StudentDeets{
  int serialNo;
  String firstName;
  float cgpa;
  char grade;
}
  class Student{


   
   public static void main(String[] args) {
      File f = null;
            try {
         
               f = new File("C:\\ARYANNCU\\JAVA_FOCPII\\filehandling\\program\\files\\file1.txt");
              FileWriter fout  = new FileWriter(f);
	      BufferedWriter bout= new BufferedWriter(fout);
 	      Scanner sc= new Scanner(System.in);
        StudentDeets st = new StudentDeets();
        do{
            System.out.print("Srno.:-")
            st.serialNo = sc.nextInt();
             System.out.print("First name")
            st.firstName = sc.next();
             System.out.print("CGPA")
            st.cgpa = sc.nextFloat();
            System.out.print("Grade.:- ")
            st.grade = sc.next().charAt(0);
            System.out.print("")
            st.lastName = sc.next();
        }
        st.serialNo = sc.nextInt();
        System.out.println("Press N to exit");
        System.out.println("\nEnter a new String");
       while(sc.hasNext()){
        String temp = sc.nextLine();
        if(temp.charAt(0) == 'N')
          break;
        else{
              bout.write(temp);
              bout.newLine();

        
       }
        
            bout.close();
			} 
		
		catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
     }
 } }