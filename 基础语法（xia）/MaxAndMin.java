public class MaxAndMin{
    public static void main(String args[]){
        int[] nums = {313,89,123,323,15,90,56,39};
        int max = nums[0], min = nums[0];
        for(int num : nums){
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }

        System.out.println("最大值为：" + max + "最小值为：" + min);
    }
}