import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1000;
        int min =1000;
        while(true){
            int a = sc.nextInt();
            if(a==999||a==-999){
                System.out.printf("%d %d",max,min);
                break;
            }
            if(a>max){
                max =a;
            }
            if(a<min){
                min=a;
            }

            
        }

    }
}