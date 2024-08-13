package ipa4;
import java.util.*;
class Employee{
	private int employeeId;
	private String name,branch;
	private double rating;
	private boolean company_transport;
	Employee(int a,String b,String c,double d,boolean e)
	{
		employeeId=a;
	    name=b;
		branch=c;;
		rating=d;
		company_transport=e;
	}
	public int getId()
	{
		return employeeId;
	}
	public String getNam()
	{
		return name;
	}
	public String getBran()
	{
		return branch;
	}
	public double getRat()
	{
		return rating;
	}
	public boolean getTrans()
	{
		return company_transport;
	}
	public void setId(int a)
	{
		employeeId=a;
	}
	public void setNam(String b)
	{
		name=b;
	}
	public void setBran(String c)
	{
		branch=c;
	}
	public void setRat(double d)
	{
		rating=d;
	}
	public void setTrans(boolean e)
	{
		company_transport=e;
	}
	
}
public class solution4 {

	public static void main(String args[])
	{
		Employee emp[]=new Employee[4];
		Employee ans2[]=new Employee[0];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			int a=sc.nextInt();sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			double d=sc.nextDouble();
			boolean e=sc.nextBoolean();sc.nextLine();
			emp[i]=new Employee(a,b,c,d,e);
		}
		int ans1=findCountOfEmployeesUsingCompTransport(emp);
		System.out.println(ans1);
		ans2=findEmployeeWithSecondHighestRating(emp);
		if(ans2==null)
			System.out.print("null");
		else
		{
		for(int i=0;i<ans2.length;i++)
		{
			System.out.println(ans2[i].getId());
			System.out.println(ans2[i].getNam());
			
		}
		}
	}
	public static int findCountOfEmployeesUsingCompTransport(Employee e[])
	{
		int count=0;
		for(int i=0;i<e.length;i++)
		{
		if(e[i].getTrans())
		{
			count++;
		}
		}
		return count;
	}
	public static Employee[] findEmployeeWithSecondHighestRating(Employee e[])
	{
		Employee num[]=new Employee[0];
		Employee arr2[]=new Employee[0];
		double max1,max2;
		int k=0;
		for(int i=0;i<e.length;i++)
		{
			if(!e[i].getTrans())
			{
				num=Arrays.copyOf(num,num.length+1);
				num[num.length-1]=e[i];
			}
		}
		if(num.length<2)
			return null;
		if(num[0].getRat()>=num[1].getRat())
		{
			max1=num[0].getRat();
			max2=num[1].getRat();
		}
		else
		{
			max2=num[0].getRat();
			max1=num[1].getRat();
		}
		for(int i=num.length-2;i>=0;i++)
		{
			if(num[i].getRat()>max1)
			{
				max2=max1;
				max1=num[i].getRat();
			}
			else if(num[i].getRat()>max2)
			{
				max2=num[i].getRat();
				
			}
		}
		for(int i=0;i<num.length;i++)
		{
		if(num[i].getRat()==max2)
		{
			arr2 = Arrays.copyOf(arr2,arr2.length+1);
	        arr2[arr2.length-1] = num[i];
			
		}
		}
		return arr2;
	}
	
}
