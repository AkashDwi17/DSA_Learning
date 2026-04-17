package LinkedList;
import java.util.*;

public  class _1CreateLinkedList {
    public static class Node {
        int data;
        Node next;
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    // Add First

    public  void addFirst (int data){
        Node newNode = new Node (data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add Last
    
    public  void addLast (int data){
        Node newNode = new Node (data);
        if (head == null ){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print

    public  void print (){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println ();
    }

    // Add Middle 

    public void addMiddle (int data, int k){
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < k-1){
            i++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Reverse LL

    public void reverseLL (){
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Delete Nth Node from End

    public  void deleteNthNodeFromEnd (int n){
        int sz = 0;
        Node temp = head;
        while (temp != null){
            sz ++;
            temp = temp.next;
        }

        int i = 1;
        Node prev = head;
        int idxToFind = sz- n;
        while (i < idxToFind-1){
            i++;
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }
    
    // Check is palindrome

    // Find Mid Node
    public static Node findMid (Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    // Check Palindrome

    public static boolean isPalimdrome (){
        if (head == null || head.next == null){
            return true;
        }
        Node midNode = findMid(head);

        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        while (right != null){
            if (left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    
    // Detect Cyle

    public static boolean isCycle (){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {  
                return true;
            }
        }
        return false;
    }
    
    // Remove Cycle

    public static void removeCycle() {
    Node slow = head;
    Node fast = head;
    boolean isCycle = false;

    // Step 1: Detect cycle
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            isCycle = true;
            break;
        }
    }

    if (!isCycle) {
        System.out.println("Cycle Doesn't Exist!");
        return;
    }

    // Step 2: Find start of cycle
    slow = head;
    while (slow != fast) {
        slow = slow.next;
        fast = fast.next;
    }

    // Step 3: Remove cycle
    Node start = slow;
    Node temp = start;
    while (temp.next != start) {
        temp = temp.next;
    }
    temp.next = null;
}

    
    public static void main (String args[]){
        _1CreateLinkedList ll = new _1CreateLinkedList();
        
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println(isCycle());
        System.out.println();
        removeCycle();
        System.out.println(isCycle());
    }
}
