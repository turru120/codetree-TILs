import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2*n;i>=1;i--){
            if(i%2!=0) {
                for(int k=(i/2)+1;k<=n;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for(int j=(i+1)/2;j>=1;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
            
        }
    }
}