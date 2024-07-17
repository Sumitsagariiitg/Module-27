import java.util.Scanner;

public class Q1 {

    
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public boolean searcher(int x){
        boolean flag= false;
        Node temp = head;
        while(temp.next != null){
            if(temp.data == x){
                flag = true;
                return flag;
            }
            temp = temp.next;
        }
        return flag;
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
        Q1 llist = new Q1();
        llist.insertAtEnd(14);
        llist.insertAtEnd(21);
        llist.insertAtEnd(11);
        llist.insertAtEnd(30);
        llist.insertAtEnd(10);
        System.out.print("The linked list is : ");
        llist.printNodes();
        System.out.println("Null");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element u want to Search ");
        int x = sc.nextInt();
        boolean res = llist.searcher(x);
        if(res == true){
            System.out.println("Present");
        }
        else{
            System.out.println("Not present");
        }
    }
}
