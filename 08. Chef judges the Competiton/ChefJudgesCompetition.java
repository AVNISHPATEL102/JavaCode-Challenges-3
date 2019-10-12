import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ChefJudgesCompetition {
	
	public static void Competition(int [] alice,int[] bob)
	{
		Arrays.sort(alice);
		Arrays.sort(bob);
		
		alice[alice.length-1] = 0;
		bob[bob.length-1]=0;
		
		int totalAlice=0;
		int totalBob=0;
		
		for(int i =0;i<(alice.length-1);i++)
		{
			totalAlice += alice[i]; 
		}
		for(int i =0;i<(bob.length-1);i++)
		{
			totalBob += bob[i]; 
		}
		
		if(totalAlice  < totalBob)
		{
			System.out.println("Alice");
		}
		else if(totalBob < totalAlice)
		{
			System.out.println("Bob");
		}
		else
		{
			System.out.println("Draw");
		}
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
			int laps = inputStream.nextInt();
			
			int [] alice = new int[laps];
			int [] bob = new int[laps];
			for(int i = 0; i<laps;i++)
			{
				alice[i] = inputStream.nextInt();
			}
			for(int i = 0; i<laps;i++)
			{
				bob[i] = inputStream.nextInt();
			}
		
			 Competition(alice,bob);
			 
		}
		
		
		
		
	}

	

}