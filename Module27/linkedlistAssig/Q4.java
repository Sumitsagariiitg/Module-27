import java.util.Scanner;

public class Q4{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public boolean palindrome(){
        Node temp1 = head;
        int n = 1;
        while(temp1.next!= null){
            n++;
            temp1 = temp1.next;
        }
        int arr[] = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = head.data;
            head =head.next;
        }
        boolean flag = true;
        for(int i = 0; i < n/2; i++){
            if(arr[i] != arr[n-1-i]){
                flag = false;
                return flag;
            }
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
        Q4 llist = new Q4();
        Scanner sc = new Scanner(System.in);
        llist.insertAtEnd(1);
        llist.insertAtEnd(2);
        // llist.insertAtEnd(2);
        // llist.insertAtEnd(1);
        // llist.insertAtEnd(6);
        System.out.print("The linked list is : ");
        llist.printNodes();
        System.out.println("Null");
        boolean isPalindrome = llist.palindrome();
        if(isPalindrome == true){
            System.out.println("Is a Palindrome");
        } 
        else{
            System.out.println("Not a palindrome");
        }
   }
}
