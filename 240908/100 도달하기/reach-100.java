import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt =1;
        int[] arr = new int[100];
        arr[0] =1;
        arr[1] =n;

        for(int i=2;i<100;i++){
            arr[i] =arr[i-2]+arr[i-1];
            cnt ++;
            if(arr[i]>100){
                break;
            }
        }
        for(int i=0;i<cnt+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}