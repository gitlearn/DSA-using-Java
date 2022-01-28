// taking end as arr.length
public class Main
{
	public static void main(String[] args) {
	    int [] arr = {5, 4, 3, 2, 1};
		mergeSort(arr, 0, arr.length);
		for(int e : arr){
		    System.out.println(e);
		}
	}
	public static void mergeSort(int [] arr, int s, int e){
	    if(e - s == 1) return;
	    int m = (s + e) / 2;
	    mergeSort(arr, s, m);
	    mergeSort(arr, m, e);
	    merge(arr, s, m, e);
	    return;
	}
	public static void merge(int [] arr, int s, int m, int e){
	    int [] mix = new int[e - s];
	    int i = s, j = m, k = 0;
	    while(i < m && j < e){
	        if(arr[i] < arr[j]){
	            mix[k] = arr[i];
	            k++;
	            i++;
	        }else {
	            mix[k] = arr[j];
	            k++;
	            j++;
	        }
	    }
	    while(i < m){
	        mix[k] = arr[i];
	        k++;
	        i++;
	    }
	    while(j < e){
	        mix[k] = arr[j];
	        k++;
	        j++;
	    }
	    for(int c = 0; c < (e - s); c++){
	        arr[s + c] = mix[c];
	    }
	}
}


//taking end as arr.length - 1
public class Main
{
	public static void main(String[] args) {
	    int [] arr = {5, 4, 3, 2, 1};
		mergeSort(arr, 0, arr.length - 1);
		for(int e : arr){
		    System.out.println(e);
		}
	}
	public static void mergeSort(int [] arr, int s, int e){
	    if(e == s) return;
	    int m = (s + e) / 2;
	    mergeSort(arr, s, m);
	    mergeSort(arr, m + 1, e);
	    merge(arr, s, m, e);
	    return;
	}
	public static void merge(int [] arr, int s, int m, int e){
	    int [] mix = new int[e - s + 1];
	    int i = s, j = m + 1, k = 0;
	    while(i <= m && j <= e){
	        if(arr[i] < arr[j]){
	            mix[k] = arr[i];
	            k++;
	            i++;
	        }else {
	            mix[k] = arr[j];
	            k++;
	            j++;
	        }
	    }
	    while(i <= m){
	        mix[k] = arr[i];
	        k++;
	        i++;
	    }
	    while(j <= e){
	        mix[k] = arr[j];
	        k++;
	        j++;
	    }
	    for(int c = 0; c < (e - s + 1); c++){
	        arr[s + c] = mix[c];
	    }
	}
}
