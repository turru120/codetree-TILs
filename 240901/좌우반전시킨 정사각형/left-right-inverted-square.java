import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 1;

        for(int i=n;i<=n*n;i+=n){
            
            for(int j=i;j>=1;j-=a){
                System.out.print(j+" ");
            }
            System.out.println();
            a++;
        }
    }
}