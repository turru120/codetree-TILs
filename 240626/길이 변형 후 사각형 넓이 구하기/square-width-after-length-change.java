import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  //가로
        int b = sc.nextInt();  //세로
    
        a +=8;
        b *=3;
        int c = a*b; //넓이

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}