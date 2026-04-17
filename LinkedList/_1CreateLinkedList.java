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
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
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

    public static void main (String args[]){
        _1CreateLinkedList ll = new _1CreateLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.reverseLL();
        ll.print();
    }
}
