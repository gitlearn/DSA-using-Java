import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int [] arr = {100,80,60,70,60,75,85};
	    online_stock_span(arr);
		for(int i : arr) System.out.println(i);
	}
	public static void online_stock_span(int [] arr){
	    Stack<int[]> s = new Stack<>();
	    s.push(new int[]{arr[0], 1});
	    for(int i = 0; i < arr.length; i++){
	        int temp = arr[i];
	        int count = 1;
	        while(s.isEmpty() == false && temp > (s.peek())[0]){
	            int [] nums = s.pop();
	            count += nums[1];
	        }
	        arr[i] = count;
	        s.push(new int[]{temp, count});
	    }
	}
}