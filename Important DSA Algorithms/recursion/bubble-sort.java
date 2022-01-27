public class Main
{
	public static void main(String[] args) {
	    int [] arr = {1, 20, 9, 0, 12};
	    bubbleSort(arr, arr.length - 1);
	    for(int i : arr){
		System.out.println(i);
	    }
	}
	public static void bubbleSort(int [] arr, int end){
	    if(end == 0) return;
	    int i = 0;
	    while(i < end){
	        if(arr[i] > arr[i+1]) {
	            int temp = arr[i];
	            arr[i] = arr[i + 1];
	            arr[i + 1] = temp;
	        }
	        i++;
	    }
	    bubbleSort(arr, end - 1);
	}
}