package ipa1;
import java.util.*;

public class solution1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	 int employeeId;
	 String employeeName;
	 int age;
	 char gender;
	 double salary;
	employee arr[]=new employee[size];
	 for(int i=0;i<size;i++)
	 {
		 employeeId=sc.nextInt();
		 employeeName=sc.nextLine();
		 sc.nextLine();
		 age=sc.nextInt();
		 sc.nextLine();
		 gender=sc.next().charAt(0);
		 salary=sc.nextDouble();
		 arr[i]=new employee(employeeId,employeeName,age,gender,salary);
	 }
	 employee ans1=getEmployeeWithSecondLowestSalary(arr);
	 if(ans1!=null)
     {
        
             System.out.print(ans1.getEmployeeId()+ "#" +ans1.getEmployeeName());
         
     }
	
     else
     {
         System.out.println("Null");
     }
	 int a=sc.nextInt();
	 int count =countEmployeesBasedOnAge(arr,a);
	 System.out.println(count);
	 System.out.println(ans1.getEmployeeName());
	}
	
	public static employee getEmployeeWithSecondLowestSalary(employee arr[])
	{
		
		double smallest = Double.MAX_VALUE;
        double secondSmallest = Double.MAX_VALUE;

        // First pass: find smallest and second smallest values
        for (employee emp : arr) {
            double salary = emp.getSalary();
            if (salary < smallest) {
                secondSmallest = smallest; // Update second smallest
                smallest = salary; // Update smallest
            } else if (salary < secondSmallest && salary != smallest) {
                secondSmallest = salary; // Update second smallest
            }
        }

        // If there's no valid second smallest salary
        if (secondSmallest == Double.MAX_VALUE) {
            return null;
        }

        // Second pass: find the employee with the second smallest salary
        for (employee emp : arr) {
            if (emp.getSalary() == secondSmallest) {
                return emp;
            }
        }

        return null;
		
	}
	
	public static int countEmployeesBasedOnAge(employee arr[],int a)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getAge()==a)
			{
				count++;
			}
		}
		return count;
	}
}

class employee
{
	private int employeeId;
	private String employeeName;
	private int age;
	private char gender;
	private double salary;
	
	employee(int employeeId,String employeeName,int age,char gender,double salary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.age=age;
		this.gender=gender;
	    this.salary=salary;
		
	}
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	public String getEmployeeName()
	{
		return employeeName;
	}
	public int getAge()
	{
		return age;
	}
	public char getGender()
	{
		return gender;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public void setEmployeeId(int employeeId)
	{
		this.employeeId=employeeId;
	}
	public void setEmployeeName(String employeeName)
	{
		this.employeeName=employeeName;
	}
	public void setAge(int age)
	{
		this.age=age;
		
	}
	public void setGender(char gender)
	{
		this.gender=gender;
	}
	public void setSalary(double salary)
	{	
	    this.salary=salary;
	}
	
}