package ipa6;
import java.util.*;
class Medicine
{
	String MedicineName,batch,disease;
	int price;
	Medicine(String a,String b,String c,int d)
	{
		MedicineName=a;
		batch=b;
		disease=c;
		price=d;
	}
	public void setName(String a)
	{
		MedicineName=a;
	}
	public void setBatch(String a)
	{
		batch=a;
	}public void setDisease(String a)
	{
		disease=a;
	}
	public void setPrice(int a)
	{
		price=a;
	}
	public String getName()
	{
		return MedicineName;
	}
	public String getBatch()
	{
		return batch;
	}
	public String getDisease()
	{
		return disease;
	}
	public int getPrice()
	{
		return price;
	}
	
	
}
public class solution6 {
	
	public static void main(String args[])
	{
		Medicine m[]=new Medicine[4];
		Medicine ans[]=new Medicine[0];
		Scanner sc=new Scanner(System.in);
	for(int i=0;i<4;i++)
	{
		String a=sc.nextLine();
		String b=sc.nextLine();
		String c=sc.nextLine();
		int d=sc.nextInt();sc.nextLine();
		m[i]=new Medicine(a,b,c,d);		
	}
	String dis=sc.nextLine();
	ans=getPriceByDisease(m,dis);
	for(int i=0;i<ans.length;i++)
	{
		System.out.println(ans[i].getPrice());
	}
	}
	public static Medicine[] getPriceByDisease(Medicine m[],String dis)
	{
		Medicine k[]=new Medicine[0];
		for(int i=0;i<m.length;i++)
		{
			if(m[i].getDisease().equalsIgnoreCase(dis))
			{
				k=Arrays.copyOf(k,k.length+1);
				k[k.length-1]=m[i];
			}
		}
		
		for(int i=0;i<k.length;i++)
		{
			for(int j=i;j<k.length;j++)
			{
				if(k[i].getPrice()>k[j].getPrice())
				{
					Medicine temp=k[i];
					k[i]=k[j];
					k[j]=temp;
				}
			}
		}
		return k;
	}
}
