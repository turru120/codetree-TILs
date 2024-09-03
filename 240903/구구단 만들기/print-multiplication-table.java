import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        if(b%2==0){
            c=b;
        }else{
            c=b-1;
        }

        for(int i=1;i<=9;i++){

            for(int j=c;j>=a;j-=2){
                
                System.out.print(j+" * "+i+" = "+j*i);
                if(j>a+1){
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}