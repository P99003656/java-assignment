import java.util.*;
import java.lang.*;
class EmployeeMain
{
 public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	String name=sc.next();
	System.out.println("\n");
	System.out.println("Enter the Address");
	String addr=sc.next();
	System.out.println("Enter the mobile ");
	String no=sc.next();
	Employee c=new Employee();
	c.setname(name);
	c.setAddress(addr);
	c.setMobile(no);
    c.Display();
	}
}
	
