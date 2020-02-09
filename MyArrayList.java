import java.util.*;
public class MyArrayList 
   {
	public void findDuplicates(List l)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to check duplicacy");
		String st=sc.nextLine();
		for(int i=0;i<l.size();i++)
		{
			if(l.contains(st))
			{
				count++;
			}
		}
		if(count==2)
		{
		System.out.println("No  duplicate element in this list");
		}
		else if(count>2)
		{
            count=count-2;
			System.out.println("There is "+count+" duplicate element in this list");
		}
		else
		{
			System.out.println("No such element ");
		}
	}
	
    public static void main(String args[])
    {
    	MyArrayList al=new MyArrayList();
    	List ma=new ArrayList();
    	ma.add("a");
    	ma.add("a");
    	ma.add("b");
    	al.findDuplicates(ma);
    /*	int s1=0;
    	do
    	{
    	System.out.println("Do you want to check another element");
    	System.out.println("press 1 or 0 for exit");
    	Scanner sc1=new Scanner(System.in);
    	int s2=sc1.nextInt();
    	s1=s2;
    	if(s2==1)
    	   {
    		al.findDuplicates(ma);
    	   }
    	else if
    	{
    		System.out.println("you have press other than 1");
    	}
    	else
    	{
        	System.out.println("Do you want to check another element");
        	System.out.println("press 1 or 0 for exit");
        	int s5=sc1.nextInt();
        	s1=s5;
    	}
    	}
    	while(s1==1);  */
    }
}
