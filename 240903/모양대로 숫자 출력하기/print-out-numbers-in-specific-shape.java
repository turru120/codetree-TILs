import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=n;j>=1;j--){
                if(j>i){
                    System.out.print("  ");
                }else{
                    System.out.print(j+" ");
                }
                
            }System.out.println();
        }

    }
}