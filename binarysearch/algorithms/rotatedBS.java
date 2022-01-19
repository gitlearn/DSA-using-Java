//recursive 
public class Main
{
	public static void main(String[] args) {
		int [] arr = { 4, 5, 6, 2, 3};
		System.out.println(rotatedBS(arr, 0, arr.length - 1, 3));
	}
	public static int rotatedBS(int [] arr, int s, int e, int target){
	    int m = s + (e - s)/2;
	    if(arr[m] == target) return m;
	    if(arr[s] <= arr[m]){
	        if(target > arr[s] && target < arr[m]){
                    //left sorted block
	            return rotatedBS(arr, s, m - 1, target);
	        }else {
                    //right block of left sorted block
	            return rotatedBS(arr, m + 1, e, target);
	        }
	    }else if(arr[m] < target && target < arr[e]){
                //right sorted block
	        return rotatedBS(arr, m + 1, e, target);
	    }else { 
                //left block of right sorted block
	        return rotatedBS(arr, s, m - 1, target);
	}
   }
}

//iterative
public class Main
{
	public static void main(String[] args) {
		int [] arr = { 4, 5, 6, 2, 3};
		System.out.println(rotatedBS(arr, 0, arr.length - 1, 3));
	}
	public static int rotatedBS(int [] arr, int s, int e, int target){
	    int m = -1;
	    while(s <= e){
	        m = s + (e - s)/2;
	        if(arr[m] == target) return m;
	        if(arr[s] <= arr[m]){
                    //left sorted block
	            if(target > arr[s] && target < arr[m]){
	                e = m - 1;
                    //right block of left sorted block
	            }else {
	                s = m + 1;
	            }
	        }
                //right sorted block
	        else if(arr[m] < target && target < arr[e]){
	            s = m + 1;
                //left block of right sorted block
	        }else { 
	            e = m - 1;
	        }
	    }
	    return -1;
   }
}