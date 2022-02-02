import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int [] arr = {4, 1, 5, 3, 9};
		NGE(arr);
		for(int i : arr) System.out.println(i);
	}
	public static void NGE(int [] arr){
	    Stack<Integer> s = new Stack<>();
	    s.push(arr[0]);
	    for(int i = 0; i < arr.length; i++){
	        int temp = arr[i];
	        while(!s.isEmpty() && temp >= s.peek()){
	            s.pop();
	        }
	        if(s.isEmpty()){
	            arr[i] = -1;
	            s.push(temp);
	        }else {
	            arr[i] = s.peek();
	            s.push(temp);
	        }
	    }
	}
}
