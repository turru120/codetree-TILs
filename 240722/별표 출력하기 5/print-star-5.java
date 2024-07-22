import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int l=i;l>=1;l--){
                for(int j=i;j>=1;j--){
                System.out.print("*");
                }
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}