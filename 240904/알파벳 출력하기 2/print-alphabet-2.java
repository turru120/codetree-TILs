import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 65;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<i){
                    System.out.print("  ");
                }else{
                    System.out.print((char)a+" ");
                    a++;
                }
                if(a==91){
                    a=65;
                }
            }
            System.out.println();
        }
    }
}