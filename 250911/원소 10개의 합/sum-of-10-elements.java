import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        int[] arr = new int[10];
        int sum=0;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++){
            arr[i] =sc.nextInt();
            sum+=arr[i];
        }
        System.out.print(sum);
    }
}