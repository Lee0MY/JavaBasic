import java.util.Arrays;

public class ArraysTest{

    public static void main(String[] args){
        int[] arr = {6, 17, 92, 32, 58, 22, 84, 66, 36, 33};
        Arrays.sort(arr);
        int fill = Arrays.binarySearch(arr, 33);
        System.out.println(fill);

        int[] arr1 = {6, 17, 92, 32, 58, 22, 84, 66, 36, 33};
        int fill1 = Arrays.binarySearch(arr1, 33);
        System.out.println(fill1);
    }

}