import java.util.Scanner;

public class ScannerDemo{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(s);

        while( !in.hasNext("exit")){
            System.out.println(in.nextLine());
        };

        // 关闭输入
        in.close();
    }
}