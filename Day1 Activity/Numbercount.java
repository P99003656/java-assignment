import java.util.*;
public class Numbercount{
	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size= sc.nextInt();
		int arr[];
		if(size<0){
			System.out.println("Invalid Input");
		}
		else{
			arr=new int[size];
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
				if(arr[i]<0){
					System.out.println("Invalid input");
				}
			}
			int key=sc.nextInt();
			int result=findElementCount(arr,size,key);
			System.out.println(result);
			}
		}
		static int findElementCount(int []arr, int size,int key){
		   int count=0;
		   for(int j=0;j<size;j++){
		      if(arr[j]==key){
		        count++;
		        }
		     }
		     return count;   		

	}
}