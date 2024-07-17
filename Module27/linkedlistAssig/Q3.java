import java.util.Scanner;

public class Q3 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public void removeDuplicates(){
        Node temp1 = head;
        Node temp2 = head;
        if(head == null){
            return;
        }
        while(temp2 != null){
            if(temp1.data == temp2.data){
                temp2 = temp2.next;
            }
            else{
                temp1.next = temp2;
                temp1 = temp2;
            }
        }
        if(temp2 == null){
            temp1.next = null;
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
        Q3 llist = new Q3();
        Scanner sc = new Scanner(System.in);
        llist.insertAtEnd(1);
        llist.insertAtEnd(1);
        llist.insertAtEnd(2);
        llist.insertAtEnd(3);
        llist.insertAtEnd(3);
        System.out.print("The linked list is : ");
        llist.printNodes();
        System.out.println("Null");
        llist.removeDuplicates();
        System.out.print("The new linked list is : ");
        llist.printNodes();
        System.out.print("Null");
   }
}
