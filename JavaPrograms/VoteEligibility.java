import java.util.Scanner;

class VoteEligibility
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your age:");
		int age=sc.nextInt();

		String result=(age>=18)?("Eligible for vote"):("Not eligible for vote");
		System.out.println(result);
	}

}
