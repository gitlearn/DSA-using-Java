import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int [] arr1 = {1, 3, 5, 7};
	    int [] arr2 = {2, 4, 6, 8};
	    mergeSortedArrays(arr1, arr2);
		for(int i : arr1) System.out.print(i+ " ");
		System.out.println();
		for(int i : arr2) System.out.print(i+ " ");
	}
	public static void mergeSortedArrays(int [] arr1, int [] arr2){
	    int i = 0;
	    while(i < arr1.length){
	        if(arr1[i] > arr2[0]){
	            int temp = arr1[i];
	            arr1[i] = arr2[0];
	            arr2[0] = temp;
	            sortArray(arr2);
	        }
	        i++;
	    }
	}
	public static void sortArray(int [] arr){
	    int i = 1;
	    int temp = arr[0];
	    while(i < arr.length && arr.length > 0 && arr[0] > arr[i]){
	        arr[i - 1] = arr[i];
	        i++;
	    }
	    arr[i - 1] = temp;
	}
}
