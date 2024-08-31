import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("* ");
        }
        System.out.println(); //1행

        for(int i=2;i<=n;i++){
            System.out.print("* ");
            for(int j=2;j<=n;j++){
                if(j<i){           
                    System.out.print("* ");
                }else if(j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}