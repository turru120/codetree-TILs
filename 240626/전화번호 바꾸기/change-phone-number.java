import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        System.out.printf("010-%s-%s",c,b);
    }
}