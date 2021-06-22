import java.util.Scanner;

public class StringUtil{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();
        String res = "";
        int len = a.length(); 
        for(int i=0;i<len;i++){
            char one = a.charAt(i); 
            if( one != ' '){
                res += a.charAt(i);
            }
        }

        System.out.println(res);
    }
}