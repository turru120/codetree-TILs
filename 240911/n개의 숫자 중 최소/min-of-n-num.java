import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        final int INT_MAX = Integer.MAX_VALUE; 
        int cnt = 0;
        int min = INT_MAX;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0;j<n;j++){
            if(arr[j]<min){
                min =arr[j];
            }
        }
        for(int k=0;k<n;k++){
            if(min==arr[k]){
                cnt++;
            }
        }
        System.out.printf("%d %d",min,cnt);
    }
}