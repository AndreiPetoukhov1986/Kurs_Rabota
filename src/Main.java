import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] arr = {2,4,5,3,4,5,6,7,8,9};
           for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] += 1;
            }
            if (i >= 2 && i <= 6) {
                System.out.println(arr[i]);
            }

        }

    }
}


