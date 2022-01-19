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
	            return rotatedBS(arr, s, m - 1, target);
	        }else {
	            return rotatedBS(arr, m + 1, e, target);
	        }
	    }if(arr[m] < target && target < arr[e]){
	        return rotatedBS(arr, m + 1, e, target);
	    }else { 
	        return rotatedBS(arr, s, m - 1, target);
	}
   }
}