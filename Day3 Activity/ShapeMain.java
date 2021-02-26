package Abstract;
import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Circle");
		System.out.println("Square");
		System.out.println("Enter the Shape");
		String Shape=sc.nextLine();
		if(Shape.equalsIgnoreCase("Circle")) {
			System.out.println("Enter the radius");
			int rad=sc.nextInt();
			Shape s1=new Circle();
			System.out.println(s1.calculateArea(rad));
		}
		else if(Shape.equalsIgnoreCase("square")) {
			System.out.println("enter the side");
			int side=sc.nextInt();
			Shape s1=new Circle();
			System.out.println(s1.calculateArea(side));
		}
		
	
		

	}

}
