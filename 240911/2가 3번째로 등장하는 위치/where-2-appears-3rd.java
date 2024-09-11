import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] A = new int[n];
        int c=0;
        int cnt =0;

        for(int i =0;i<n;i++){
            A[i] = sc.nextInt();
        }

        for(int i =0;i<n;i++){
            c++;
            if(A[i]==2){
                cnt++;
            }
            if(cnt ==3){
                System.out.print(c);
                break;
            }
        }        
    }
}