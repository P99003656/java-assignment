
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<RankProgram> ls=new ArrayList<RankProgram>();
		System.out.println("Please provide the number of  players ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name of the player "+(i+1));
			String name=sc.next();
			System.out.println("Enter the score of the player "+(i+1));
			int run=sc.nextInt();
			ls.add(new RankProgram(name,run));
		}
		Collections.sort(ls);
		for(RankProgram r:ls)
		{
			System.out.println(r);
		}
	}

}

