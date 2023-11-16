package PrcaticeCode;
import java.util.*;
public class OperationChoice 
{

	public static void main(String[] args) 
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice for 1.Find out greater between 3 NO ,	2.Check given no is even or odd , 3.Checkk the given character is vowel or not , 4.check the given no is divible by 5 or not");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1 ://Finds Greatest number between three numbers
				int num1,num2,num3;
				System.out.println("Enter the value of num1 =");
				num1=sc.nextInt();
				System.out.println("Enter the value of num2 =");
				num2=sc.nextInt();
				System.out.println("Enter the value of num3 =");
				num3=sc.nextInt();
				System.out.println("The value of num1 is ="+num1);
				System.out.println("The value of num2 is ="+num2);
				System.out.println("The value of num3 is ="+num3);
				if(num1>+num2&&num1>=num3)
				{
					System.out.println(num1+" "+"Is Greater than"+" "+num2+" "+"and"+" "+num3);
				}
				else if(num2>=num1&&num2>=num3)
				{
					System.out.println(num2+" "+"Is Greater than"+" "+num1+" "+"and"+" "+num3);
				}
				else
				{
					System.out.println(num3+" "+"Is Greater than"+" "+num1+" "+"and"+" "+num2);
				}
				break;
				
		case 2 : //Find Given number is even or odd
				System.out.println("Enter the value of num4 =");
				int num4=sc.nextInt();
				if(num4%2==0)
				{
					System.out.println(num4+" "+"is Even Number");
				}
				else
				{
					System.out.println(num4+" "+"is Odd Number");
				}
				break;
				
		case 3 : //Find Given Character is Vowel or Not
				System.out.println("Enter Character = ");
				char character = sc.next().charAt(0);
				// Checking Vowel Character
				if((character=='a'||character=='A')||(character=='e'||character=='E')||(character=='i'||character=='I')||(character=='o'||character=='O')||(character=='u'||character=='U'))
				{
	            	System.out.println(character + " is a Vowel.");
				}
				else
				{
	                		System.out.println(character + " Is not vowel");
				}
				break;
				
		case 4 : //check the given no is divible by 5 or not
				System.out.println("Enter the number for check is it divisible by 5 or not");
				num1=sc.nextInt();
				if(num1%5==0)
				{
					System.out.println(num1+" "+"Is Divisible by 5");
				}
				else
				{
					System.out.println(num1+" "+"Is not Divisible by 5");
				}
	             break;  
				
		default : 
			System.out.println("Please Entered Correct Choice");
				
		}
		
	}

}
