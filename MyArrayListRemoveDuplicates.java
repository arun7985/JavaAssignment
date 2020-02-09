import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MyArrayListRemoveDuplicates 
   {
	public List removeDuplicates(List l)
	{
		int size=l.size();
		Object[] aj=l.toArray();
		int count=0;
		int x=0;
		for(int j=0;j<size;j++)
		{
		for(int i=j;i<size;i++)
		{
			if(aj[j]==(aj[i]))
			{
				count++;
				 if(count>1)
					{
						aj[i]="?";
						count=count-1;
		            }
			}
		}
		count=0;
		}
		int len=aj.length;
		for(int q=0;q<len;q++)
		{
			if(aj[q]=="?")
				x++;
		}
		int z=size-x;
		Object ar[]=new Object[z];
		int w=0;
		for(int i=0;i<z;i++)
		{
			for(int j=w;j<len;j++)
			{
				if(aj[j] !="?")
				{
					ar[i]=aj[j];
					w=j+1;
					break;
				}
				
			}
			
			
		} 
		l=Arrays.asList(ar);
		return l;
		
	}
	
    public static void main(String args[])
    {
    	MyArrayListRemoveDuplicates al=new MyArrayListRemoveDuplicates();
    	List ma=new ArrayList();
    	
    	ma.add("a");
    	ma.add("a");
    	ma.add("a");
    	ma.add("a");
    	ma.add("d");
    	ma.add("aa");
    	ma.add("a");
    	ma.add("b");
    	ma.add("c");
    	List t=al.removeDuplicates(ma);
    	System.out.println(t);
    
    }
}
