import java.util.*;
public class EmployeeTest1{

	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		int num=scan.nextInt();
		Employee1 employees[]=new Employee1[num];
		int i;
		for (i=0;i<num;i++){
			employees[i] = new Employee1();
			System.out.println("Enter the name of Employee:");
			employees[i].name = scan.nextLine();
			if (i==0) scan.nextLine();
			System.out.println("Enter the Year of Joining:");
			employees[i].yearOfJoining = scan.nextInt();
			System.out.println("Enter the address of Employee:");
			scan.nextLine();
			employees[i].address = scan.nextLine();
		}
			System.out.println("Name\t\tYear\t\tAddress");
			for (i=0;i<num;i++){
				employees[i].displayInfo();
			}
	}
}