import java.util.Arrays;

public class firstq {
    public static void main(String[] args) {
        int[] arr = {-1, -20, 30, 40, 50, -8};
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            if(arr[left] <0){
                left++;
            }else if(arr[right] >= 0){
                right--;
            }else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Array after moving negatives:");
        System.out.println(Arrays.toString(arr));
    }
}
