package Stack;
import java.util.*;

public class _2StackUsingLL {
    public static class Node {
        int data;
        Node next;
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack{
        public static Node head = null;
        public static Node tail = null;

        // ISEmpty
        public  boolean isEmpty(){
            return head == null;
        }

        // Push
        public  void push (int data){
            Node newNode = new Node (data);
            if (head == null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // Pop
        public  int pop(){
            if (isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek
        public  int peek (){
            if (isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    
    public static void main (String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()){
            System.out.print (s.peek()+" ");
            s.pop();
        }
    }
}
