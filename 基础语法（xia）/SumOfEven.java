public class SumOfEven{
    public static void main(String args[]){
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            if(i%2 == 0){
                sum += i;
            }
        }

        System.out.println("用 for , 1 到 1000 中，所有偶数和为：" + sum);
    }
}