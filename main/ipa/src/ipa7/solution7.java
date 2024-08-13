package ipa7;
import java.util.*;
class Autonomous{
	int  carId,noOfTestsConducted,noOfTestsPassed;
	String brand,environment;
	Autonomous(int a,String b,int c,int d,String e)
	{
		carId=a;
		brand=b;
		noOfTestsConducted=c;
		noOfTestsPassed=d;
	    environment=e;
	}
	public int getId()
	{
	return carId;
	}
	public void setId(int a)
	{
	 carId=a;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String b)
	{
		brand=b;
	}
	public int getCon()
	{
		return noOfTestsConducted;
	}
	public void setCon(int c)
	{
		noOfTestsConducted=c;
	}
	public int getPass()
	{
		return noOfTestsPassed;
	}
	public void setPass(int d)
	{
		noOfTestsPassed=d;
	}
	public String getEnv()
	{
		return environment;
	}
	public void setEnv(String e)
	{
		environment=e;
	}
}
public class solution7 {

	public static void main(String args[])
	{
		Autonomous arr[]=new Autonomous[4];
		Autonomous ans2[]=new Autonomous[0];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			int a=sc.nextInt();sc.nextLine();
			String b=sc.nextLine();
			int c=sc.nextInt();
			int d=sc.nextInt();sc.nextLine();
			String e=sc.nextLine();
			arr[i]=new Autonomous(a,b,c,d,e);
		}
	String env1=sc.nextLine();
	String bran1=sc.nextLine();	
	
	int ans1=findTestPassedByEnv(arr,env1);
	System.out.println(ans1);
	ans2=updateCarGrade(arr,bran1); 
	int sum1=0,sum2=0;
	for(int i=0;i<ans2.length;i++)
	{
		sum1=sum1+ans2[i].getPass();
		sum2=sum2+ans2[i].getCon();	
	}
	int rate=(sum1*100)/(sum2);
	if(rate>=80)
	{
		System.out.println(bran1 + "::"+"A1");
	}
	else
	{
		System.out.println(bran1 + "::"+"B1");
	}
	}
	public static int findTestPassedByEnv(Autonomous arr[],String env1)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getEnv().equalsIgnoreCase(env1))
			{
				sum=sum+arr[i].getPass();
			}
		}
		if(sum!=0)
			return sum;
		return 0;
	}
	public static Autonomous[] updateCarGrade(Autonomous arr[],String bran1)
	{
		Autonomous ans2[]=new Autonomous[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getBrand().equalsIgnoreCase(bran1))
			{
				ans2=Arrays.copyOf(ans2, ans2.length+1);
				ans2[ans2.length-1]=arr[i];
			}
		}
		return ans2;
	}
}