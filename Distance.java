package Assisment;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        double z=Math.sqrt((x*x)+(y*y));
        System.out.println(z);
    }
}
