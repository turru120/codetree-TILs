import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= 0;
        int []countarr = new int[10]; 

        for(int i=0;i<10;i++){
            a = a/b;
            countarr[(a%b)]++;
            if(a<=1){
                break;
            }
        }
        for(int j=0;j<10;j++){
            c += (countarr[j])*(countarr[j]);
        }
        System.out.print(c);
    }
}