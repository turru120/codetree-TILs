import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int sum=0;
        int cnt=0;
        float avg=0;

        for(int i=0; i<10; i++){
            arr[i]= sc.nextInt();
            if(arr[i]==0){
                break;
            }else if(arr[i]%2==0){
                cnt++;  
                sum+= arr[i];
            }
        }  
        avg=(float)sum/cnt;
        System.out.printf("%d %d",cnt,sum);
    }
}