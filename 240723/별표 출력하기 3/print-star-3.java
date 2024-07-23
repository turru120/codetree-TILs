import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){        //행

            for(int k=0;k<i;k++){          //공백
                System.out.print("  ");
            }
            
            for(int j=(2*n)-(2*i)-1;j>=1;j--){   //별
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}