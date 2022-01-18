package functions;

import java.util.Scanner;

public class Max_of_three{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = (a>b) ? a : b;
        int e = (d>c) ? d : c;
        System.out.println(e);
    }
}