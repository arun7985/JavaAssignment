
public class MyStack
{
	private int ar[];
	private int capacity;
	private int top;
	public MyStack(int size)
	{
		ar = new int[size];
		capacity=size;
		top=-1;
	}
	public void push(int x)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
			System.exit(0);
		}
		ar[++top]=x;
	}
	public boolean isFull()
	{
		return top== (capacity-1);
	}
	public boolean isEmpty()
	{
		return top== -1;
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			System.exit(0);
		}
		return ar[top-1];
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			System.exit(0);
		}
	 return ar[top];
	}
	public static void main(String args[])
	{
		MyStack ms=new MyStack(9);
		for(int i=0;i<9;i++)
		{
		ms.push(i+20);
		}
		System.out.println("Peek element in stack is  "+ms.peek());
		System.out.println("Peek element in stack is  "+ms.isFull());
		ms.push(11);
		
	}

}
