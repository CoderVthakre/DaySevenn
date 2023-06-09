package Assisment;

public class L {
    public static void main(String args[]) {
        //System.out.println("available"+Integer.parseInt(args[1]));

        int sum=99;
        for(int i=0;i<args.length;i++){
            sum=sum+Integer.parseInt(args[i]);
        }
        System.out.println(sum);



    }
}
