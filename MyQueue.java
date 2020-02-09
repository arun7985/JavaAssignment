import java.util.*;
public class MyQueue
{
  private int array[];
  private int capacity;
  private int size;
  private int front;
  private int rear;
  public MyQueue(int size)
  {
	  array=new int[size];
	  capacity=size;
	  front=0;
	  rear=-1;
  }
  public boolean isFull()
  {
	  return front==capacity;
  }
  public boolean isEmpty()
  {
	  return front==0;
  }
  public void enqueue(int element)
  {
	  if(isFull())
	  {
		  System.out.println("Queue is full");
		  System.exit(0);
	  }
	  rear=rear+1;
	  array[rear]=element;
	  front=front+1;;
  }
  public void dequeue()
  {
	  if(isEmpty())
     {
	  System.out.println("Queue is empty");
	  System.exit(0);
      }
	  rear=rear-1;
	}
  public int peek()
  {
	  if(isEmpty())
	     {
		  System.out.println("Queue is empty");
		  System.exit(0);
	      }
	  return array[front-1];
  }
  public static void main(String args[])
  {
	MyQueue mm=new MyQueue(10);
	mm.enqueue(100);
	mm.enqueue(200);
	mm.enqueue(37);
	int w=mm.peek();
	System.out.println(w);
	mm.dequeue();
	System.out.println(mm.isEmpty());
	System.out.println(mm.isFull());
	
  }
}
