public class movezerotostart {
    public static void main(String[] args) {
        int[] arr = {10,0,0,20,40,50,60};
        int[] newArr = new int[arr.length];
        rearrange(arr, newArr);
        print(newArr);
    }
    private static void rearrange(int[] arr, int[] newArr){
        //
        int j = 0;

        for(int i =0; i<arr.length; i++){
            if(arr[i]==0){
                newArr[j]= arr[i];
                j++;
            }

        }
        for(int i =0; i<arr.length ; i++){
            if(arr[i]!=0){
                newArr[j]=arr[i];
                j++;
            }
        }
    }
    private static void print(int[] arr){
        //
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
