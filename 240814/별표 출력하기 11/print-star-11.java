import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =2*n+1;i>=1;i--){
            if(i%2!=0){
                for(int j=2*n+1;j>=1;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for(int k=2*n+1;k>=1;k--){
                    if(k%2 !=0){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }System.out.println();
            }
            
        }
    }
}