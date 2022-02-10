public class Main
{
	public static void main(String[] args) {
	    int [] arr = { 0, 2, 1, 2, 1, 2, 1, 2, 0, 0, 0, 1 };
	    sortArray(arr);
		for(int i : arr) System.out.println(i);
	}
	public static void sortArray(int [] arr){
	    int lo = 0;
	    int mid = 0;
	    int hi = arr.length - 1;
	    while(mid <= hi){
	        switch(arr[mid]){
	            case 0 : {
	                int temp = arr[lo];
	                arr[lo] = arr[mid];
	                arr[mid] = temp;
	                lo++;
	                mid++;
	                break;
	            }
	            case 1 : {
	                mid++;
	                break;
	            }
	            case 2 : {
	                int temp = arr[hi];
	                arr[hi] = arr[mid];
	                arr[mid] = temp;
	                hi--;
	                break;
	            }
	        }
	    }
	}
}
