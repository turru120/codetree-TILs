import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int k =i-1;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=(2*n)-(2*i)+1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>1;i--){
            for(int k =n-i+1;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=(2*n)-(2*i)+1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
}