import java.util.Arrays;

public class movenegative {
    public static void main(String[] args) {
        int[] arr = {-1, -20, 30, 40, 50, -8};
        int[] temp = new int[arr.length];
        int index = 0;

        // first add negative numbers
        for (int num : arr) {
            if (num < 0) {
                temp[index++] = num;
            }
        }

        // then add positive numbers
        for (int num : arr) {
            if (num >= 0) {
                temp[index++] = num;
            }
        }

        System.out.println(Arrays.toString(temp));
    }
}
