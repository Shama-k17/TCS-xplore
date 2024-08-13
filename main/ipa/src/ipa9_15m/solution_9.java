package ipa9_15m;
import java.util.*;
public class solution_9 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Input number:");
	int a=sc.nextInt();sc.nextLine();
	int b=a;
	int remainder,result=0;
	while(b!=0)
	{   
		remainder=b%10;
		result+=Math.pow(remainder,3);
		b=b/10;
	}
	if(result==a)
	{
		System.out.println("Yes, the number is an Armstrong number.");
	}
	else
	{
		System.out.println("No, the number is not an Armstrong number.");
	}
}
}
