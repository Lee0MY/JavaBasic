import java.util.Scanner;

public class ContrastString{
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // 获取String值
        String a = in.nextLine();
        String b = in.nextLine();

        if( a.length() == b.length() ){
            int len = a.length();
            int res = 0;
            for(int i=0;i<len;i++){
                if(a.charAt(i) != b.charAt(i)){
                    System.out.println("不同");
                    res = 1;
                    break;
                }
            }
            if(res == 0){
                System.out.println("相同");
            }
            
        }else{
            System.out.println("不同");
        }
    }
    
}