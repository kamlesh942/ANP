import java.util.Scanner;

class Employee
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the exp:");
		
		int exp=sc.nextInt();
		System.out.println("enter the Salary:");

		int salary=sc.nextInt();

		
		double bonus=(exp>20)?(salary*0.20): (salary*0.10);
		
		System.out.println("bonus:"+bonus);

	
	}

}