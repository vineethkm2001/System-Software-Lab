import java.util.Scanner;
import java.util.*;
class FL1
{
	Scanner scan=new Scanner(System.in);
	void Fifo()
	{
		int f,p,num=0,PageHit=0;
		int pages[],frame[];
		boolean flag=true;
		System.out.println("Enter the frame size :");
		f=scan.nextInt();
		System.out.println("Enter the number of pages : ");
		p=scan.nextInt();
		pages=new int[p];
		frame=new int[f];
		System.out.println("Enter the page number of "+p+" pages :");
		for(int i=0;i<p;i++)
			pages[i]=scan.nextInt();
		for(int i=0;i<f;i++)
			frame[i]=-1;
		for(int i=0;i<p;i++)
		{
			flag=true;
			int page=pages[i];
		    for(int j=0;j<f;j++)
		    {
		    	if(frame[j]==page)
		    	{
		    		flag=false;
		    		PageHit++;
		    		break;
		    	}
		    }
		    if(num==f)
		    	num=0;
		    if(flag)
		    {
		    	frame[num]=page;
		    	num++;
		    }
		    System.out.print("\nFrame :");
		    for(int k=0;k<f;k++)
		    	System.out.print(frame[k]+" ");
		}
		System.out.println("\nNumber of page faults = "+(p-PageHit));
		System.out.println("Number of page hits = "+PageHit);
		
	}
	void Lru()
	{
		int f,p,num=0,pageHit=0,page,count=0,pointPage=0,pg=0;
		int pages[];
		int frame[];
		int recent[];
		boolean flag=true;

		boolean flag2=true;
		System.out.println("Enter the number of frames:");
		f=scan.nextInt();
		System.out.println("Enter the number of pages:");
		p=scan.nextInt();
		frame=new int[f];
		pages=new int[p];
		recent=new int[f];
		for(int i=0;i<f;i++)
			recent[i]=frame[i]=-1;
		   	
		System.out.println("Enter the page number of "+p+" pages :");
		for(int i=0;i<p;i++)
			pages[i]=scan.nextInt();
		
		for(int i=0;i<p;i++)
		{
			flag=true;
			page=pages[i];
			for(int j=0;j<f;j++)
			   recent[j]=-1;
			for(int j=0;j<f;j++)
			{
				
				if(frame[j]==page)
				{
					flag=false;
					pageHit++;
					break;
				}
			}//////////////////for  j ends////////////////////
		
			
			if(flag)
			{
				count=0;
				if(i>=f)
				{
					pointPage=i-1;
				while(count<f)
				{
					if(pointPage==-1)
						break;
					pg=pages[pointPage];
					flag2=true;
					for(int j=0;j<f;j++)
					
						if(pg==recent[j])
						{
							flag2=false;
							break;
						}
				
				if(flag2)
				{
					recent[count]=pg;
					count++;
					pointPage--;
				}
				else
					pointPage--;
			  }////////////////////////////while////////////////////////
				System.out.print("Recent:");
				for(int j=0;j<f;j++)
				  System.out.print(recent[j]+" ");
				System.out.println();
				
				int replace=recent.length-1;
				int pg_to_replace=recent[replace];
				int k=0;
				while(frame[k]!=pg_to_replace)
					k++;
				frame[k]=page;
			}///////////////////////i>=f///////////////////////////////
			else
				frame[i]=page;
			}
			System.out.println("\nFrame:");
			for(int k=0;k<f;k++)
				System.out.print(frame[k]+" ");
			System.out.println();
		
	   }///////////////////////////for i/////////////////////////
		System.out.println("\nNumber of pagehits: "+pageHit);
		System.out.println("Number of page faults: "+(p-pageHit));

	}
}

public class FifoLru1{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		FL1 flr=new FL1();
		while(true)
		{
		System.out.println("\n1:FIFO(First In First Out)\n2:LRU(Least Recently Used)\n3:Exit\n");
		System.out.println("Enter your choice : ");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:flr.Fifo();
				break;
		case 2:flr.Lru();
		       break;
		case 3:System.exit(0);
		}
	   }
}
}


