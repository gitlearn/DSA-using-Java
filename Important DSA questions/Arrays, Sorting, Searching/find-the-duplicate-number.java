//Approach 1 => T.C = O(nlogn), array will be modified
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int [] arr = {1, 3, 4, 2, 2};
		findDuplicate(arr);
	}
	public static void findDuplicate(int [] arr){
	    Arrays.sort(arr);
	    for(int i = 0; i < arr.length - 1; i++){
	        if(arr[i] == arr[i + 1]) System.out.println(arr[i]);
	    }
	}
}

//Approach 2 => T.C = O(2n), S.C = O(n).
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int [] arr = {3,1,3,4,2};
		findDuplicate(arr);
	}
	public static void findDuplicate(int [] arr){
	    int [] temp = new int[arr.length];
	    for(int i = 0; i < arr.length; i++){
	        temp[arr[i] - 1]++;
	    }
	    for(int j = 0; j < arr.length; j++){
	        if(temp[j] == 2){
	            System.out.println(j + 1);
	        } 
	    }
	}
}

//Approach 3 => T.C = O(n), S.C = O(1)
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int [] arr = {1, 3, 4, 2, 2};
		findDuplicate(arr);
	}
	public static void findDuplicate(int [] arr){
	    int slow = arr[0];
	    int fast = arr[0];
	    do{
	        slow = arr[slow];
	        fast = arr[arr[fast]];
	    }while(slow!=fast);
	    fast = arr[0];
	    while(fast != slow){
	        fast = arr[fast];
	        slow = arr[slow];
	    }
	    System.out.println(slow);
	}
}
