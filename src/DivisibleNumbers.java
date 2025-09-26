import java.util.Scanner;

public class DivisibleNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            if ((num % 3 == 0) ^ (num % 5 == 0)) {
                System.out.print(num + " ");
            }
        }
    }
}
