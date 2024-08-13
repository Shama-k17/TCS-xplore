package ipa3;
import java.util.*;
class Course
{ 
  
  private int courseId;
   private  String courseName;
  private String courseAdmin;
  private int quiz;
  private int handson;
  
  Course(int a,String b,String c,int d,int e)
  {
    this.courseId=a;
    this.courseName=b;
    this.courseAdmin=c;
    this.quiz=d;
    this.handson=e;
  }
  public int getCourseId()
  {
    return this.courseId;
  }
  public String getCourseName()
  {
    return this.courseName;
  }public String getCourseAdmin()
  {
    return this.courseAdmin;
  }public int getQuiz()
  {
    return this.quiz;
  }
  public int getHandson()
  {
    return this.handson;
  }
  public void setCourseId(int a)
  {
    this.courseId=a;
  }
  public void setCourseName(String b)
  {
    this.courseName=b;

  }public void setCourseAdmin(String c)
  {
    this.courseAdmin=c;
  }public void setQuiz(int d)
  {
    this.quiz=d;
  }
  public void setHandson(int e)
  {
    this.handson=e;
  }

}
public class solution3 {

  public static void main(String args[])
  {
   
    Scanner sc=new Scanner(System.in);
    Course cs[]=new Course[4];
    Course ans2[]=new Course[0];
    for(int i=0;i<4;i++)
    {
      int a = sc.nextInt();sc.nextLine();
      String b = sc.nextLine();
      String c = sc.nextLine();
      int d = sc.nextInt();
      int e = sc.nextInt();sc.nextLine();
      cs[i]=new Course(a,b,c,d,e);
    }
    String admin = sc.nextLine();
    int hand = sc.nextInt();

    int ans1 = findAvgOfQuizByAdmin(cs, admin);
    if(ans1!=0)
    {
      System.out.println(ans1);
    }
    else
    {
      System.out.println("No Course found");
    }

    ans2 = sortCourseByHandsOn(cs, hand);
    if(ans2!=null)
    {
      for(int i=0; i<ans2.length; i++)
      {
        System.out.println(ans2[i].getCourseName());
      }
    }
    else
    {
      System.out.println("No Course found with mentioned attribute.");
    }
  }
  public static int findAvgOfQuizByAdmin(Course cs[],String str)
  {

    int sum=0, count=0;
    for(int i=0; i<cs.length; i++)
    {
      if(cs[i].getCourseAdmin().equalsIgnoreCase(str))
      {
        sum = sum+cs[i].getQuiz();
        count++;
      }
    }
    if(count>0)
    {
      int avg = sum/count;
      return avg;
      
    }
    else
    {
      return 0;
    }
  }
  public static Course[] sortCourseByHandsOn (Course cs[],int f)
  {
    Course cs1[]=new Course[0];
    int num[]=new int[0];
    int k=0;

    for(int i=0;i<cs.length;i++)
    {
      if(cs[i].getHandson()<=f)
      {
             num= Arrays.copyOf(num,num.length+1);
             num[num.length-1] = cs[i].getHandson();
      }

    }
    Arrays.sort(num);
    for(int j=0;j<num.length;j++)
    {
      for(int m=0;m<cs.length;m++)
      {
        if(num[j]==cs[m].getHandson())
        {
          cs1 = Arrays.copyOf(cs1,cs1.length+1);
          cs1[cs1.length-1] = cs[m];
        }
      }
    }
    return cs1;
  }
}
