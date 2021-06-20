public class AverageScore{
    public static void main(String args[]){
        int[] scores = {61, 57, 95, 85, 75, 65, 44, 66, 90, 32};
        int sum = 0;
        double res;

        for(int i=0;i<scores.length;i++){
            sum += scores[i];
        }        
        res = sum / 10.0;

        System.out.println("十位同学的平均成绩为：" + res);
        
    }
}