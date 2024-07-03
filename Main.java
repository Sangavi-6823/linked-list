import java.util.Scanner;
class Linkedlist{
    Node head;
class Node{
    int data;
    Node next;
    Node(int val){
        data=val;
        next=null;
    }
}
Linkedlist(){
    head=null;
}
public void insertatbegin(int val){
    Node newnode=new Node(val);
    if(head==null){
        
        head=newnode;
    }
    else{
        newnode.next=head;
        head=newnode;
    }
}
public void display(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data+" ");
        temp=temp.next;
        
    }
}
public void insertAtpos(int pos,int val){
        Node newnode= new Node(val);
        if(pos==0){
            insertatbegin(val);
            return;
        }
        else{
            Node temp;
            temp=head;
            for(int i=1;i<pos;i++){
                temp=temp.next;
                if(temp==null){
                    System.out.print("Invslid position");
                    return;
                }
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }
    public void delete(int pos){
        Node prev=null;
        Node temp=head;
        for(int j=1;j<=pos;j++){
            prev=temp;
            temp=temp.next;
            if(prev.next==null){
                System.out.println("Invalid! Position is not found");
                return;
            }
        }
        prev.next=temp.next;
    }
}
public class Main
{
	public static void main(String[] args) {
		Linkedlist l=new Linkedlist();
		 while (true) {
		System.out.println("Menu");
		System.out.println("1.Insert at Begin");
		System.out.println("2.Insert at Position");
		System.out.println("3.Display");
		System.out.println("4.Delete");
		System.out.println("5.Exit");
		System.out.println("Enter Your Choice");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		int val,pos;
		switch(ch){
		    case 1:
		       System.out.print("Enter no: ");
                    val= sc.nextInt();
                    l.insertatbegin(val);
                    break;
            case 2:
		       System.out.print("Enter no: ");
                    val= sc.nextInt();
                    pos= sc.nextInt();
                    l.insertAtpos(pos,val);
                    break;
		    case 3:
                    l.display();
                    break;
            case 4:
		       System.out.print("Enter no: ");
                    val= sc.nextInt();
                    l.delete(val);
                    break;
            case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;
            default:
                    System.out.println("Invalid choice! Please try again.");
		 
		}
		}
		
	}
}