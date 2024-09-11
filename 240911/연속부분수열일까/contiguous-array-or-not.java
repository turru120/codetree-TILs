import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] A = new int[n1];
        int[] B = new int[n2];
        int cnt =0;
        for(int i =0;i<n1;i++){
            A[i] = sc.nextInt();
        }
        for(int i =0;i<n2;i++){
            B[i] =sc.nextInt();
        }
        for(int k=0;k<n1;k++){
            for(int j =0;j<n2;j++){
                if(A[k]==B[j]){
                    cnt ++;
                    break;
                    
                }
            }
        }
        if(cnt==n2){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
    }
}