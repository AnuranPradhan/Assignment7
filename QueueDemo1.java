package Assignment7;
import java.util.Scanner;
public class QueueDemo1 {
	static Scanner sc =new Scanner(System.in);
private static final int MAX=10;
static int front=-1;
static int rear=-1;
public static boolean isFull(int data[]) {
	return (rear==data.length-1);
}
public static  boolean isEmpty(int data[]) {
	return (rear==-1);
}
public static void insert(int data[]) {
	System.out.println("Enter the element");
	int item=sc.nextInt();
	if(isFull(data)) {
		System.out.println("Queue is full");
	}
	if(front==-1) {
		front=0;
	}
	data[++rear]=item;
}
public static void delete(int data[]) {
	if(isEmpty(data)) {
		System.out.println("Queue is empty");
	}
	int delete =data[++front];
}
public static void display(int data[]) {
	if(isEmpty(data)) {
		System.out.println("Queue is empty");
	}
	System.out.println("The Elements of Queue are");
	for(int i=front;i<=rear;i++) {
		System.out.print(data[i]+" ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		 int queue[]=new int[MAX]; 
		 
		 while(true) 
		 { 
		 
		 System.out.println("***MENU***"); 
		 System.out.println("0: Exit"); 
		 System.out.println("1: Insert"); 
		 System.out.println("2: Delete"); 
		 System.out.println("3: Display"); 
		 System.out.println("Enter your choice"); 
		 int choice=sc.nextInt(); 
		 switch(choice) 
		 { 
		 case 0: 
		 System.exit(0); 
		 case 1: 
		 insert(queue); 
		 break; 
		 case 2:
			delete(queue);
			break;
		 case 3:
			 display(queue);
			 break;
		default:
			System.out.println("Invalid Choice");
		 }
		 }
	}

}
