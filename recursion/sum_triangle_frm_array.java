public class sum_triangle_frm_array{
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        trianglearray(arr);
    }
    static void trianglearray(int [] arr){
        if(arr.length == 1){
            System.out.print("[ ");
            for(int i : arr){
                System.out.print(i + ", ");
            }  
            System.out.print("]");
            System.out.println();
            return;
        }      
        int [] arr1 = new int[arr.length-1];
        for(int i=0; i<arr.length-1; i++){
            arr1[i] = arr[i]+arr[i+1];
        }
        trianglearray(arr1);
        System.out.print("[ ");
        for(int i : arr){
            System.out.print(i + ", ");
        }  
        System.out.print("]");
        System.out.println();
        return;
    }
    // @Override
    // public String toString(int[] arr) {
    //     return 
    // }
}