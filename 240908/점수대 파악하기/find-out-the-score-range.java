import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr =new int[100];
        int[]countarr = new int [101];
        
        for(int i=0;i<101;i++){
            arr[i]=sc.nextInt();
            countarr[(arr[i]/10)*10]++;
            if(arr[i]==0){
                break;
            }
        }
        for(int j=100;j>=10;j-=10){
            System.out.println(j+" - "+countarr[j]);
        }
    }
}