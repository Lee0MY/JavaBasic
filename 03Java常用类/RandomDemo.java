import java.util.Random;

public class RandomDemo{
    public static void main(String[] args){
        Random random = new Random();
        // 随机生成一个整数 int 范围
        System.out.println(random.nextInt());
        // 生成 [0,n] 范围的整数 设n=100
        System.out.println(random.nextInt(100 + 1));
        // 生成 [0,n) 范围的整数 设n=100
        System.out.println(random.nextInt(100));
        // 生成 [m,n] 范围的整数  设n=100 m=40
        System.out.println( (random.nextInt(100-40+1) + 40) );
        // 随机生成一个整数 long 范围
        System.out.println(random.nextLong());
        // 生成[0,1.0)范围的 float 型小数
        System.out.println(random.nextFloat());
        // 生成[0,1.0)范围的 double 型小数
        System.out.println(random.nextDouble());
    }

}