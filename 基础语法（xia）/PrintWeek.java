import java.util.Scanner;

public class PrintWeek{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        switch(x){
            case 1:
                System.out.println("今天是星期一");
                break;
            case 2:
                System.out.println("今天是星期二");
                break;
            case 3:
                System.out.println("今天是星期");
                break;
            case 4:
                System.out.println("今天是星期四");
                break;
            case 5:
                System.out.println("今天是星期五");
                break;
            case 6:
                System.out.println("今天是星期六");
                break;
            case 7:
                System.out.println("今天是星期天");
                break;
            default:
                System.out.println("请输入有效数据");
        }
    }

}