package ipa5;
import java.util.*;
class player
{
	int playerId; 
	String skill; 
	String level; 
	int   points;
	player(int a,String b,String c,int d)
	{
		playerId=a;
		skill=b;
		level=c;
		points=d;
		
	}
	
public int getId()
{
	return playerId;
}

public String getSkill()
{
	return skill;
}
public String getLevel()
{
	return level;
}
public int getPoints()
{
	return points;
}
public void setId(int a)
{
	playerId=a;
}

public void setSkill(String a)
{
	skill=a;
}
public void setLevel(String a)
{
	level=a;
}
public void setPoints(int a)
{
	points=a;
}


}
public class solution5 {
	
public static void main(String args[])
{    int a,d;
     String b,c;
	player obj1[]=new player[4];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<4;i++)
	{
		 a=sc.nextInt(); sc.nextLine();
		 b=sc.nextLine(); 
		 c=sc.nextLine();
	     d=sc.nextInt();sc.nextLine();
		 obj1[i]=new player(a,b,c,d);
	}
	String b1=sc.nextLine();
	String c1=sc.nextLine();
	//for(int i=0;i<obj1.length;i++)
	//{
		//System.out.println(obj1[i].getLevel());
	//}
	int ans1=findPointsForGivenSkill(obj1,b1);
	System.out.println(ans1);
	player ans2=getPlayerBasedOnLevel(obj1,b1,c1);
	System.out.println(ans2.getId());
	
}

public static int findPointsForGivenSkill(player e[],String b1)
{
	int sum=0;
	for(int i=0;i<e.length;i++)
	{
		if((e[i].getSkill().equalsIgnoreCase(b1)))
				{
			      
			       sum=sum+e[i].getPoints();
				}
	}
	
  return sum;
}
public static player getPlayerBasedOnLevel(player e[],String b1,String c1)	
{
	player k;
	for(int i=0;i<e.length;i++)
	{
		if((e[i].getSkill().equalsIgnoreCase(b1))&&(e[i].getLevel().equalsIgnoreCase(c1))&&(e[i].getPoints()>=20))
		{
			k=e[i];
			return k;
		}
	}
	return null;
}
}