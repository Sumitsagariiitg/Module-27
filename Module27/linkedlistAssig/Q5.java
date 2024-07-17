import java.util.Scanner;

import org.w3c.dom.Node;

public class Q5 {
    ListNode  head;
   
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int d){
            val = d;
            next = null;
        }
    }
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
    public ListNode insertAtEnd(int newdata){
        ListNode newNode = new ListNode(newdata);
        // ListNode head = null;
        //IF THE LINKED LIST IS EMPTY
        if(head == null){
            head = new ListNode(newdata);
            return head;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        return head;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        int digit =0;
        int carry = 0;
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        ListNode p =l1, q= l2;
        while(p != null || q != null){
            int x = (p!=null) ? p.val : 0;
            int y = (q!=null) ? q.val : 0;
            int sum = carry+ x + y;
             carry = sum/10;
            current.next = new ListNode(sum%10);
            
            
            current = current.next;
            if(p != null)p = p.next;
            if(q!=null)q = q.next;
        }
        if(carry>0){
                current.next = new ListNode(carry);
            }
        return temp.next;
    }

    public static void printNodes(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp= temp.next;
        }
    }

    public static void main(String[] args) {
        Q5 llist1 = new Q5();
        Q5 llist2 = new Q5();
        Scanner sc = new Scanner(System.in);
        llist1.insertAtEnd(5);
        llist1.insertAtEnd(6);
        llist1.insertAtEnd(3);
        // llist1.insertAtEnd(1);
        // llist1.insertAtEnd(6);
        System.out.print("The First linked list is : ");
        printNodes(llist1.head);
        System.out.println("Null");
        llist2.insertAtEnd(8);
        llist2.insertAtEnd(4);
        llist2.insertAtEnd(2);
        // llist2.insertAtEnd(5);
        // llist2.insertAtEnd(9);
        System.out.print("The Second linked list is : ");
        printNodes(llist2.head);
        System.out.println("Null");
        Q5 llist3 = new Q5();
        ListNode head1;
        head1 = addTwoNumbers(llist1.head, llist2.head);
        head1 = reverseList(head1);
        System.out.print("The Final linked list is : ");
        printNodes(head1);
        System.out.println("Null");
    }
}
