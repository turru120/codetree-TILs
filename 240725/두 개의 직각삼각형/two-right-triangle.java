import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");   //왼쪽 삼각형 별
            }
            for(int l=i;l<n;l++){      //중간 공백
                System.out.print("  ");
            } 
                      
            for(int k=i;k>=1;k--){       //오른쪽 삼각형 별
                System.out.print("*");
            }
            System.out.println();
        }
    }
}