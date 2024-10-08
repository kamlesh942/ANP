import java.util.Scanner;

class CheckChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character:");

		char ch=sc.next().charAt(0);
		
		String result=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?"The character is vovel" : "the character is Consonant"	;	
		System.out.println(result);
		
	}

}