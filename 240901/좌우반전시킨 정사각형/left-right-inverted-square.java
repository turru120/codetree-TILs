import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 1;

        for(int i=4;i<=4*n;i+=4){
            
            for(int j=i;j>=1;j-=a){
                System.out.print(j+" ");
            }
            System.out.println();
            a++;
        }
    }
}