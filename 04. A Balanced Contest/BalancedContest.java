import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class BalancedContest {
	
	
	public static boolean contest(int[] arr, int people)
	{
		int hard=0;
		int cakeWalk=0;
		double hardCheck = (double)people/(double)10;
		double cakeWalkCheck = (double)people/2.0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i] >= cakeWalkCheck)
			{	
				cakeWalk++;
			}
			if(arr[i] <= hardCheck)
			{
				hard++;
			}
		}
		if(cakeWalk == 1 && hard == 2)
			return true;
		else
			return false;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner inputStream = null;
		try {
			inputStream = new Scanner( new FileInputStream("/Users/mr.a/Desktop/eclipse/Codechef/src/stuff.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File stuff .txt was not found");
			System.exit(0);
		}
		
		int t = inputStream.nextInt();
		for(int j =0 ; j<t;j++) 
		{
			int problems = inputStream.nextInt();
			int people = inputStream.nextInt();
			
			int[] arr = new int[problems];
			
			for(int i=0;i<problems;i++)
			{
				arr[i] = inputStream.nextInt();
			}
			
			System.out.println(contest(arr,people));
			
		}
		
		
		
		
	}

	

}