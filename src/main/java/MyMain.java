import java.util.Arrays;
public class MyMain {
   
    // Reverses an array
    public static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++){
            int hold = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = hold;

        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int large = -999;
        int sec = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > large){
                sec = large;
                large = arr[i];
            }
            else if (arr[i] > sec){
                sec = arr[i];
            }
        }
        System.out.println("The second largest number is " + sec);
        return sec;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        if (arr.length <= 2){
            System.out.println("The array is geometric");
            return true;
        }
        double geo = (double)arr[0]/(double)arr[1];
        System.out.println(geo);
        for (int i = 0; i < arr.length - 1; i++){
            if (geo != (double)arr[i]/(double)arr[i+1]){
                System.out.println("The array is not geometric");
                return false;
            }   
        }
        System.out.println("The array is geometric");
        return true;
    }


    public static void main(String[] args) {
        int arr[]= {1,2,4,8,16};
        reverse(arr);
        secondLargest(arr);
        isGeometric(arr);
        } 
    }
