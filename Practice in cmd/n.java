import java.util.Scanner;
public class n{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	
	String str = sc.nextLine();
	
	System.out.println(str);
	
	char arr[] = str.toCharArray();	
	
	
	for(int i=0 ; i <arr.length ; i++)
	{
		System.out.println(arr[i]);
	}
	
	

	}
	
}