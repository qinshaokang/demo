package demo;

/**
 * @author qinshaokang
 * @description: 二分法查找
 * @date 2019-11-07 17:21
 */
public class Erfenfa {
    public static void main(String[] args) {
        StringBuilder builde = new StringBuilder();
        builde.append("");

    }

    public static int search(int[]arr, int num){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int middle = (start + end) / 2;
            if(num < arr[middle]){
                start = middle;
            }else if(num > arr[middle]){
                end = middle;
            }else{
                return middle;
            }
        }
        return -1;

    }

}
