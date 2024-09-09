import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        int cnt=1;

        for(int j=0;j<n;j++){
            arr[j] =sc.nextInt();
        }

        for(int i=1;i<=q;i++){    
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a ==1){
                System.out.println(arr[b-1]);
            }
            else if(a==2){
                cnt=1;
                for(int l=0;l<n;l++){
                    if(b!=arr[l]){
                        cnt++;
                    }else{
                        break;
                    }
                }
                if(cnt>n){
                    cnt =0;
                }
                System.out.println(cnt);
            }
            else{
                int c =sc.nextInt();
                for(int k=b-1;k<c;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}