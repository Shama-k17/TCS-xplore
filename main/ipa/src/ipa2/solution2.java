package ipa2;


import java.util.*;
class Employee
{
  private int id; 
  private String name;
  private String designation;// (String)
  private double salary;// (double)
  Employee(int id,String name,String designation,double salary)
  {
    this.id =id;
    this.name=name;
    this.designation=designation;
    this.salary=salary;
  }
  public double getSalary()
  {
    return salary;
  }
  public String getDesignation()

  {
    return designation;
  }
  public int getId()
    {
      return id;
    }
    public String getName()

    {
      return name;
    }
}
class company {

   private	String companyName;
   private Employee[] emp;
   private int numEmployees ;
   company(String a,int b)
   {
     this.companyName=a;
     this.numEmployees=b;
   }
   public static double getAverageSalary(Employee e[])
   {
     double sum=0;
     for(int i=0;i<e.length;i++)
     {
       sum=sum+e[i].getSalary();
     }
     
     return sum/e.length;
   }
   public static double getMaxSalary(Employee e[])
   {
     double max=e[0].getSalary();
     for(int i=0;i<e.length;i++)
     {
       if(max<e[i].getSalary())
         max= e[i].getSalary();
     }
     return max;

   }
  public Employee[] getEmployeesByDesignation(String des1,Employee e[])
   {  
      Employee[] emp=new Employee[0];
    
    for(int i=0;i<e.length;i++)
     {
       if(e[i].getDesignation().equalsIgnoreCase(des1))
       {
         emp = Arrays.copyOf(emp,emp.length+1);
         emp[emp.length-1] = e[i];
         System.out.println(e[i].getDesignation());
       }
     }
     if(emp.length>0)
       {
           return emp;
       }
       return null;
   }
}
   public class solution2
   {
   public static void main(String args[])
   {

     Scanner sc=new Scanner(System.in);
     System.out.print("enter company name:");
     String c=sc.nextLine();
     System.out.print("enter number of employees:") ;
     int n=sc.nextInt();
     Employee obj1[]=new Employee[n];
     System.out.println("employee details:");
     company obj2=new company(c,n);
     for( int i=0;i<n;i++)
     {
       System.out.print("enter id:");
           int id=sc.nextInt();
           sc.nextLine();
       System.out.print("enter name:");
       		String nam=sc.nextLine();
       System.out.print("enter destination:");
       		String des=sc.nextLine();
       System.out.print("enter salary:");
       		double sal=sc.nextDouble(); sc.nextLine();
       obj1[i]=new Employee(id,nam,des,sal);
     }
      System.out.println("Average salary:"+obj2.getAverageSalary(obj1));
      System.out.println("Max Salary:"+obj2.getMaxSalary(obj1));
      System.out.println("Employees with designation: "); 
      sc.nextLine();
      String des1=sc.nextLine();
       Employee[] ans = obj2.getEmployeesByDesignation(des1,obj1);
     if(ans!=null)
       {
           for (int i = 0; i < ans.length; i++) {
               System.out.println("ID: "+ans[i].getId()+", Name: "+ans[i].getName()+", Designation: "+ans[i].getDesignation()+", Salary: "+ans[i].getSalary());
           }
       }  
           
       }

   }

