import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);

        int cnt =0;

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                break;
            }
            cnt++;
        }
        for(int i=cnt-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}