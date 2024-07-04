import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int add = a+n;

        for(int i=1;i<=n;i++){
            System.out.println(add);
            add += n;

            
            }
        
    }
}