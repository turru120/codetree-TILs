import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[]arr = new int[n];
        int []countarr = new int[10];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
                countarr[arr[i]]++;
        }
        for(int j=1;j<10;j++){
            System.out.println(countarr[j]);
        }
    
    }
}