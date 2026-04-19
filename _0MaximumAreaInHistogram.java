package Stack;
import java.util.*;

public class _0MaximumAreaInHistogram {
    public static int maximumAreaInHistogram (int arr[]){
        Stack <Integer> s = new Stack<>();

        int maxArea = 0;
        int nsr[] = new int  [arr.length];
        for (int i=arr.length-1; i>=0; i--){
            while (!s.isEmpty() && arr[i] <= arr[s.peek()]){
                s.pop();
            }
            if (s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        int nsl[] = new int [arr.length];
        s = new Stack<>();
        
        for (int i=0; i<arr.length; i++){
            while (!s.isEmpty() && arr[i] <= arr[s.peek()]){
                s.pop();
            }
            if (s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        
        for (int i=0; i<arr.length; i++){
            int ht = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = ht * width;
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }
    
    public static void main (String args[]){
        int arr[] = {2,1,5,6,2,3};
        System.out.println(maximumAreaInHistogram(arr));
    }
}
