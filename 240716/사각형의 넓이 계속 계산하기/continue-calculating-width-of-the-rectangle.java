import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int width = sc.nextInt();//가로
            int length = sc.nextInt();//세로
            char c = sc.next().charAt(0);
            System.out.println(width*length);
            if(c=='C'){
                break;
            }
        }   
    }
}