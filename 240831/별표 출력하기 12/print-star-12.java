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
            System.out.print("  ");
            for(int j=2;j<=n;j++){
                if(j%2==0 && j>=i){           //짝수열인경우에만 *찍기 근데 열>=행 인경우만
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}