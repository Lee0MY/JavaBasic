public class MathTest{
    public static void main(String[] args){
        double a, b;
        a = Math.random();
        b = Math.random();
        System.out.println("a = " + a + ", b = " + b + ".");
        System.out.println("较大值为：" + Math.max(a, b));
    }
}