import java.util.Scanner;

public class Fifteen {
	Scanner s = new Scanner(System.in);
	int i,n;
	int array[]=new int[12];
	public void getarray()
	{
		System.out.println("enter the arraylimit");
		n=s.nextInt();
		System.out.println("enter the array values");
		for(i=0;i<n;i++)
		{
			array[i]=s.nextInt();
		}
	
	} 
	public void displayarray()

	{
		System.out.println("your entered array is");
		for(i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
	}
	

	public static void main(String[] args) {
		Fifteen ob=new Fifteen();
		ob.getarray();
		ob.displayarray();
	}

}