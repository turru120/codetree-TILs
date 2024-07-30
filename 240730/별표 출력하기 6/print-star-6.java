import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =n; i>=1; i--) {       
            
            for (int j = (2*i)-1; j >=1 ; j--) {
                System.out.print("* ");
            } 
            System.out.println();

            if(i!=1){
                for( int l= (2*n)-(2*i)+2;l>=1;l--){
                System.out.print(" ");
                }
            }
    
        }
        for (int i =n; i>1; i--) {
            for( int l= (2*n)+(2*i)-12;l>=1;l--){
                System.out.print(" ");
            }
            for (int k = 3+(2*n)-(2*i); k >=1 ; k--) {
                    System.out.print("* ");
                } 
            System.out.println();
        }

       
       
    }
}