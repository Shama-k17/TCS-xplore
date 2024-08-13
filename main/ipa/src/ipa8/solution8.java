package ipa8;
import java.util.*;
class Movie
{
	String movieName,company,genre;
	int budget;
	Movie(String a ,String b,String c,int d)
	{
		movieName=a;company=b;genre=c;budget=d;
	}
	public void setNam(String a) {
		movieName=a;
	}
	public void setCom(String a) {
		company=a;
	}
	public void setGenre(String a) {
		genre=a;
	}
	public void setBudget(int a) {
		budget=a;
	}
	public String getNam() {
		return movieName;
	}
	public String getCom() {
		return company;
	}
	public String getGenre() {
		return genre;
	}
	public int getBudget() {
		return budget;
	}
}


public class solution8 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Movie m[]=new Movie[4];
		Movie ans1[]=new Movie[0];
		
		for(int i=0;i<4;i++)
		{
			String a=sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			int d=sc.nextInt();sc.nextLine();
			m[i]=new Movie(a,b,c,d);
		}
		String str=sc.nextLine();
		ans1=getMovieByGenre(m,str);
		for(int j=0;j<ans1.length;j++) {
			if(ans1[j].getBudget()<80000000)
			{
				System.out.println("low budget Movie");
			}
			else
			{
				System.out.println("High budget Movie");
			}
		}
	}
	public static Movie[] getMovieByGenre(Movie e[],String str)
	{
		Movie k[]=new Movie[0];
		for(int i=0;i<e.length;i++)
		{
			if(e[i].getGenre().equalsIgnoreCase(str)) {
				k=Arrays.copyOf(k,k.length+1);
				k[k.length-1]=e[i];
				
			}
		}
		return k;
	}
	
}
