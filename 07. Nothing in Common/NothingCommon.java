import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class NothingCommon {
	
	public static int Common(int[] arr1, int[] arr2)
	{
		int com =0;
		
		for(int i =0 ; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length;j++)
			{
				if(arr2[j] == arr1[i])
					com++;
			}
		}
		return com;
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
			int set1 = inputStream.nextInt();
			int set2 = inputStream.nextInt();
			
			int [] arr1 = new int[set1];
			int [] arr2 = new int[set2];
			
			for(int i =0;i<arr1.length;i++)
			{
				arr1[i] = inputStream.nextInt();
			}
			for(int i =0;i<arr2.length;i++)
			{
				arr2[i] = inputStream.nextInt();
			}
			
			System.out.println(Common(arr1,arr2));
		}
		
		
		
		
	}

	

}