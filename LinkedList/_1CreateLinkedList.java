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
    public static void main (String args[]){
        _1CreateLinkedList ll = new _1CreateLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.print();
    }
}
