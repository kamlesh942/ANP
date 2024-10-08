import java.util.Scanner;

class CheckChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");

		int marks=sc.nextInt();
		
		String result=(marks>=80 && marks<=100)? "Your are passed":(marks>=60 && marks<80)? "you are passed" : (marks>=40 && marks<60)?"you are passed":" your are fail";
		
		System.out.println(result);
		
	}

}