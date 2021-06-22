import java.util.Arrays;

public class SystemTest{
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6};
        int[] b = {1,1,1,1,1,1};
        System.arraycopy(a,1,b,1,3);

        System.out.println(Arrays.toString(b));
        System.out.println("Java的安装目录为：" + System.getProperty("java.home"));
    }
}