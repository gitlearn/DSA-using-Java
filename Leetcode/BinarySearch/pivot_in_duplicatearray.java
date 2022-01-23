public class Main
{
	public static void main(String[] args) {
	    int arr [] = { 2, 2, 2, 9, 1 };
	    System.out.println(pivot_in_duplicate(arr));
	}
	public static int pivot_in_duplicate(int [] arr){
	    int s = 0;
	    int e = arr.length - 1;
	    int m = -1;
	    while(s <= e){
	        m = (s + e)/2;
	        if(m < e && arr[m] > arr[m+1]) return m;
	        else if(s < m && arr[m] < arr[m-1]) return m-1;
	        if(arr[s] == arr[m] && arr[s] == arr[e]){
	            if(arr[s] > arr[s + 1]) return s;
	            s++;
	            if(arr[e] < arr[e - 1]) return e-1;
	            e--;
	        }
	        else if(arr[s] < arr[m] || (arr[s] == arr[m] && arr[m] > arr[e])) {
                s = m + 1;
            } else {
                e = m - 1;
            }
	    }
	    return -1;
	}
}
