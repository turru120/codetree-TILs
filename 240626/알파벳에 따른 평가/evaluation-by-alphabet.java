import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(a=='S'){
            System.out.print("Superior");
        }else if(a=='A'){
            System.out.print("Excellent");
        }else if(a=='B'){
            System.out.print("Good");
        }else if(a=='C'){
            System.out.print("Usually");
        }else if(a=='D'){
            System.out.print("Effort");
        }else{
            System.out.print("Failure");
        }


    }
}