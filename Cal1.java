
import java.util.Scanner;
public class Cal1 extends Exception
{
	
	public int Calculator()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int x=sc.nextInt();
		System.out.println("Enter Second Number");
		int y=sc.nextInt();
		System.out.println("Press:");
		System.out.println("1.   Addition");

		System.out.println("2.   Subtraction");
		System.out.println("3.   Multiplication");
		System.out.println("4.   Division");
		System.out.println("5.   Power");
		int z=sc.nextInt();
		switch (z) {
		case 1: {
			return x+y;
		}
		case 2: {
			return x-y;
		}
		case 3: {
			return x*y;
		}
		case 4: {
			try {
			return x/y;
			}
			catch(Exception e)
			{
				System.out.println("Please dont divide by 0");
				this.revise();
			}
		}
		case 5: {
			try
			{
			if(y<0 || x<0)
			{
				throw new Exception("");
			}
              return (int)Math.pow(x,y);
			}
			catch(Exception e)
			{
				System.out.println("please enter postive numbers for pow");
				//Calculator();
			}
		}
		default:
			throw new IllegalArgumentException("Unexpected value: Please enter correct value  " + z);
		}
	}
public static void main(String args[])
{

	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to user calculator");
	Cal1 c=new Cal1();
	int k=c.Calculator();
	System.out.println("Your result is   "+k);
    new Cal1().revise();
}
	 public void revise()
		{
			System.out.println("Press 1 to continue and 0 to exit");
		    Scanner sc=new Scanner(System.in);
		     int w=sc.nextInt();
		    while(w!=1 && w!=0)
		     {
			  System.out.println("Please give correct input");
			   System.out.println("Press 1 to continue and 0 to exit");
		       w=sc.nextInt();
		     }
		       if(w==1)
		  	    {
		  		int q=new Cal1().Calculator();
		  		System.out.println("Your result is   "+q);
		  		this.revise();
		    	}
		     	else if(w==0)
		    	{
		  		System.out.println("thankyou:)");
		  	   }
		      
		
	      }
	
	
	
	
}

