import java.util.Scanner;

public class Q2 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public void insertAtmiddle(int pointer, int val){
        Node temp = head;
        Node  newnode = new Node(val); 
        while(temp.next != null){
            
            if(temp.data == pointer){
                newnode.next = temp.next;
                temp.next = newnode;
                return;
            }
            temp = temp.next;
        }
        if(temp.next == null){
            temp.next = newnode;
            return;
        }
    }

    public void insertAtEnd(int newdata){
        Node newNode = new Node(newdata);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        return;
    }

    public void printNodes(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp= temp.next;
        }
    }


    public static void main(String[] args) {
        Q2 llist = new Q2();
        Scanner sc = new Scanner(System.in);
        llist.insertAtEnd(1);
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(5);
        llist.insertAtEnd(6);
        System.out.print("The linked list is : ");
        llist.printNodes();
        System.out.println("Null");
        System.out.print("Enter the pointer : ");
        int pointer = sc.nextInt();
        System.out.print("Enter the val to be added : ");
        int val = sc.nextInt();
        llist.insertAtmiddle(pointer, val);
        System.out.print("The new linked list is : ");
        llist.printNodes();
        System.out.print("Null");
   }
}
