public class Jump{
    public static void main(String args[]){
        for(int i=1;i<=10;i++){
            System.out.println("循环第"+i+"次");
            if(i % 3 == 0){
                break;
            }
            if(i % 5 == 0){
                System.out.println("我进来了！");
            }
        }
        System.out.println("-------------");
        for(int i=1;i<=10;i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}