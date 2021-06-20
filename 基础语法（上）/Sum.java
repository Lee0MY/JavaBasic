import java.util.Scanner;

public class Sum{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        //获取 int 值
        int x1 = in.nextInt();
        int x2 = in.nextInt();

        System.out.println("x1 + x2 = " + (x1+x2));
    } 
}