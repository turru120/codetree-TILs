import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] evenarr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int j=arr.length-1;j>=0;j--){
            if(arr[j]%2==0){
                System.out.print(arr[j]+" ");  
            }
            
        }
    }
}