import java.util.*;
import java.util.Stack;

public class prevSmaller {
    public static void prevSmaller(int[] arr) {
        System.out.print("-1");

        for(int i = 1; i < arr.length; i++) {
            int j;
            for(j = i - 1; j >= 0; j-- ) {
                if(arr[j] < arr[i]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            if(j == -1) {
                System.out.print("-1");
            }
        }
    }

    public static void prevSmallerStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < arr.length; i++) {
            while(!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            if(stack.isEmpty()){
                    System.out.print("-1");
            }else {
                System.out.print(stack.peek() + " ");
            }
            stack.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 3, 4, 5};
        prevSmallerStack(arr);
    }
}
