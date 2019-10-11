import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ChefAndEmploymentTest {
	
	public static int prefixSum(int[] arr,int index)
	{
		int sum=0;
		for(int i=index;i>=0;i--)
		{
			sum+=arr[i];
		}
		return sum;
	}
	public static int suffixSum(int[] arr,int index)
	{
		int sum=0;
		for(int i=index;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	public static int Chef(int[] arr)
	{
		int[] a = new int[arr.length];
		for(int i =0;i<arr.length;i++)
		{
			a[i] = prefixSum(arr,i)+suffixSum(arr,i);
		}
		int index=0;
		int min=a[0];
		for(int i =1;i<a.length;i++)
		{
			if(a[i] < min)
			{
				index=i;
				min=a[i];
			}
		}
		return index+1;
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
			int K = inputStream.nextInt();
			int [] arr = new int[N];
			
			for(int i=0;i<N;i++)
			{
				arr[i] = inputStream.nextInt();
			}
			Arrays.sort(arr);;
			System.out.println(arr[K]);
			
		}
		
		
		
		
	}

	

}