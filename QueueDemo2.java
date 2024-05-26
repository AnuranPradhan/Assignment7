package Assignment7;

import java.util.Scanner;

class Node{
	int info;
	Node next;
	public Node(int info) {
		this.info=info;
		this.next=null;
	}
}
public class QueueDemo2 {
static Scanner sc=new Scanner(System.in);
public static Node insert(Node rear,Node front) {
	System.out.println("Enter the element");
	int item=sc.nextInt();
	Node node =new Node(item);
	if(front==null) {
		front=rear=node;
	}
	rear.next=node;
	rear=node;
	return rear;
}
public static Node delete(Node rear,Node front) {
	if(front==null) {
		System.out.println("Queue is Empty");
rear=front;
	}else{
front=front.next;
	}
	return front;
}
public static void display(Node front) {
	if(front==null){
		System.out.println("Queue is empty");
	}
	Node temp=front;
	while(temp!=null) {
		System.out.print(temp.info+" ");
		temp=temp.next;
	}
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Node rear = null, front = null;

        while (true) {
            System.out.println("****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    rear=insert(rear,front);
                    if(front==null) {
                    	front=rear;
                    }
                    break;
                case 2:
                	front = delete(rear, front);
                    if (rear == null) {
                        rear = front;
                    }
                    break;
                case 3:
                    display(front);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
	}

}
