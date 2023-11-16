package PrcaticeCode;
import java.util.*;
public class OpearatorsEx 
{

	public static void main(String[] args) 
	{
		int num1,num2, Choice, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Yourchoice for Performed Operators = 1.Arithmetic operator 2.Logical Operator 3.Relational Operator  4.Bitwise Operator 5.Conditional Operator 6.Assignment Operator");
		Choice=sc.nextInt();
		switch(Choice)
		{
		case 1 ://for Arithmetic operator +
				System.out.println("Enter The value of num1 =");
				num1=sc.nextInt();
				System.out.println("Enter The value of num2 =");
				num2=sc.nextInt();
				result=num1+num2;//For Addition +
				System.out.println("Addition of num1+num2= "+result);
				result=num1-num2;//For Substraction - 
				System.out.println("Substraction of num1+num2= "+result);
				result=num1*num2;//For Multiplication *
				System.out.println("Multiplication of num1+num2= "+result);
				result=num1/num2;//For Division / 
				System.out.println("Division of num1+num2= "+result);
				result=num1%num2;//For Modulas 
				System.out.println("Mod of num1+num2= "+result);
				break;
		
		case 2://for Logical Operator(&&,||,!)
				boolean num3 = true , num4 = false;
				System.out.println("num3: " + num3);
				System.out.println("num4: " + num4);
				System.out.println("num3 && num4: " + (num3 && num4));//Logical && Operator
				System.out.println("num3 || num4: " + (num3 || num4));//Logical || Opeartor
				System.out.println("!num3: " + !num3);//Logical Not ! Operator
				System.out.println("!num4: " + !num4);
				break;
				
		case 3 : // For Realtional Opearator(<,>,==,!=) 
				System.out.println("Enter The value for num1 & num2  between 1-10=");
				num1=sc.nextInt();
				num2=sc.nextInt();
				if(num1!=num2)//!= operator
				{
				if(num1>=1&&num2<=10)//<=,>= operator
					{
						System.out.println("The values of num1 & num2 is between 1-10");
					}	
					else
					{
						System.out.println("Enter correct values of num1 & num2");
					}
				}
				if(num1==num2)//== operator
				{
					System.out.println("Vlaues of num1 & num2 is equal");
				}
				else 
				{
					System.out.println("Vlaues of num1 & num2 is not equal");
				}
				break;
			
		case 4: //For Bitwise Operator
				// Initial values
	        	int num5 = 5, num6 = 7;
	        	// bitwise and
	        	// 0101 & 0111=0101 = 5
	        	System.out.println("num5&num6 = " + (num5 & num6));
	        	
	        	// bitwise or
	        	// 0101 | 0111=0111 = 7
	        	System.out.println("num5|num6 = " + (num5 | num6));
	 
	        	// bitwise xor
	        	// 0101 ^ 0111=0010 = 2
	        	System.out.println("num5^num6 = " + (num5 ^ num6));
	        	break;
	        	
		case 5 : //For Conditional Operator
				System.out.println("Enter the value of num1 =");
				num1=sc.nextInt();
				System.out.println("Enter the value of num2=");
				num2=sc.nextInt();
				result=(num1<num2)?num1:num2;
				System.out.println("The Result of Conditional operator is ="+result);
				break;
				
		case 6: //Assignment Operator
				System.out.println("Enter the value of num1 =");
				num1=sc.nextInt();
				System.out.println("Enter the value of num2 =");
				num2=sc.nextInt();
				
				// Adding & Assigning values
				num1 += num2;
				System.out.println("Result of Adding Assignemnt values = "+num1);
				
				// Subtracting & Assigning values
				num1-=num2;
				System.out.println("Result of Substraction Assignemnt values = "+num1);
				
				// Multipilcation & Assigning values
				num1*=num2;
				System.out.println("Result of Multipication Assignemnt values = "+num1);
			
				// Division & Assigning values
				num1/=num2;
				System.out.println("Result of Division Assignemnt values = "+num1);
			
				// Modules & Assigning values
				num1%=num2;
				System.out.println("Result of Modules Assignemnt values = "+num1);
				break;
				
				
		default:
				System.out.println("Enter Correct Choice ");
		}
	 

	       
		

	}

}
