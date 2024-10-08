import java.util.Scanner;

class CheckChar
{
	public static void main(String args[])
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("enter Character:");
		char ch = sc.next().charAt(0);
		
		String check =(Character.isUpperCase(ch))? "character is in upper case" : "character is not in upper case" ;
		System.out.println(check);
	}

}