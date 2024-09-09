import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= 0;
        int []countarr = new int[10]; 

        while(true){
            countarr[(a%b)]++;
            a = a/b;
            if(a<=1){
                break;
            }
        }
        for(int i=0;i<10;i++){
            c += (countarr[i])*(countarr[i]);
        }
        System.out.print(c);
    }
}