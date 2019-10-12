import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Stipend {
	
	public static boolean std(int[] arr)
	{
		if(arr[0] == 2)
			return false;
		if(arr[arr.length-1] != 5)
			return false;
		double total=0;
		for(int i =0 ; i<arr.length;i++)
		{
			total+=arr[i];
		}
		if((total/arr.length) >= 4.0)
		{
			return true;
		}
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
			int N = inputStream.nextInt();
			int [] arr = new int[N];
			
			for(int i=0;i<N;i++)
			{
				arr[i] = inputStream.nextInt();
			}
			Arrays.sort(arr);;
			System.out.println(std(arr));
			
		}
		
		
		
		
	}

	

}