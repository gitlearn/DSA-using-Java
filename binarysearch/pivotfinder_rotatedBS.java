//If the array is not rotated this wont work.
public class Main
{
	public static void main(String[] args) {
		int [] arr = {4, 5, 6, 12, 1};
		System.out.println(pivotfinder(arr, 0, arr.length - 1));
	}
	public static int pivotfinder(int [] arr, int s, int e){
	    if(s > e){
	        return -1;
	    }
	    int m = s + (e - s)/2;
	    if(arr[m] > arr[m + 1]){
	        return m;
	    }else if(arr[m] < arr[m-1]){
	        return m-1;
	    }else if(arr[s] > arr[m]){
	        return pivotfinder(arr, s , m-1);
	    }else return pivotfinder(arr, m+1, e);
	}
}
