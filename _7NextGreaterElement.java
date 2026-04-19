package Stack;
import java.util.*;

public class _7NextGreaterElement {
    public static int [] nextGreaterElement (int arr[]){
        Stack<Integer> s = new Stack<>();

        int nextGreater[] = new int [arr.length];

        for (int i=arr.length-1; i>=0; i--){
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]){
                s.pop();
            }
            if (s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        return nextGreater;
    }
    public static void print (int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print (arr[i]+"  ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        int arr[] = {6,8,0,1,3};
        print(arr);
        int result[] = nextGreaterElement(arr);
        print(result); 
    }
}
