package functions;

import java.util.Scanner;

public class Even_or_odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int num = s.nextInt();
        oddoreven(num);
    }
    static void oddoreven(int a){
        if((a & 1)==1){
            System.out.println("its odd");
            return;
        }
        else{
            System.out.println("its even");
        }
    }
}
