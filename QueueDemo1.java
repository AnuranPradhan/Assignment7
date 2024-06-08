package Assignment7;
import java.util.Scanner;
public class QueueDemo1 {
	static Scanner sc =new Scanner(System.in);
public static final int MAX=5;
public static int front=-1;
public static int rear=-1;
public static boolean isFull(int data[]) {
	return (rear==data.length-1);
}
public static  boolean isEmpty(int data[]) {
	return (rear==-1);
}
public static void insert(int data[]) {
	if(isFull(data)) {
		System.out.println("Queue is full");
	}else {
		System.out.println("Enter the Element: ");
        int x = sc.nextInt();
        data[++rear] =x;
        System.out.println("Data inserted: "+x);
        if(front==-1){
            front = front+1;
        }
	}
}
public static void delete(int data[]) {
	if(isEmpty(data)) {
		System.out.println("Queue is empty");
		return;
	}
	System.out.println("Deleted data is"+data[front++]);
}
public static void display(int data[]) {
	if(isEmpty(data)) {
		System.out.println("Queue is empty");
		return;
	}
	System.out.println("The Elements of Queue are:");
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
