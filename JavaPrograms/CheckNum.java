import java.util.Scanner;

class CheckChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");

		int num=sc.nextInt();
		
		String check= (num>0)? "Number is positive":(num==0) ? "number is zero" : "Number is negative";

		
		System.out.println(check);
		
	}

}