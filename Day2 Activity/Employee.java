import java.util.*;
public class Employee
{

	private String name;
	private String address;
	private String mobile;

	public String getname()
	{
		return name;

	}
	public void setname(String name)
	{
		this.name= name;
	}
	public String getMobile()
	     {
	     	return mobile;

	     }
	     public void setMobile(String mob)
	     {
	     	this.mobile=mob;
	     }
	 public String getAddress()
	 {
	 	return address;
	 }    
	     public void setAddress(String address)
	     {
	     	this.address=address;
	     }
	      public void Display()
	      {
	      	System.out.println("Employee Details");
	      	System.out.println("Name: " + getname());
	      	System.out.println("Address: " + getAddress());
	      	System.out.println("Mobile: " + getMobile());
	      }
}