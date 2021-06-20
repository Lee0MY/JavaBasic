import java.util.Scanner;

public class InputTest{
    public static void main(String args[]){
        String[] words = new String[100];
        Scanner in = new Scanner(System.in);
        int i = 0;
        
        System.out.println("输入：");
        while(!in.hasNext("end")){
            words[i] = in.nextLine();
            i++;
        }
        System.out.println("输出：");
        for(int j = 0;j<i;j++){
            System.out.println(words[j]);
        }
    }
    
}