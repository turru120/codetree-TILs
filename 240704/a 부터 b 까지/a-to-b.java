import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int i =a;

        do{
            System.out.print(i+" ");
            if(i %2 !=0){
                i *=2;
            }else{
                i +=3;
            }

        }while(i <= b);
    }
}