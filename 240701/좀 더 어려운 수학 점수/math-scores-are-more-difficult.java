import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a_m = sc.nextInt();
        int a_e = sc.nextInt();
        int b_m = sc.nextInt();
        int b_e = sc.nextInt();
        if(a_m> b_m ){
            System.out.print("A");
        }else if (b_m>a_m){
            System.out.print("B");
        }else{
            if(a_e> b_e ){
            System.out.print("A");
        }else{
            System.out.print("B");
        }
        }
    }
}