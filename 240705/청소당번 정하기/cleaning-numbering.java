import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cl =0;
        int hall = 0;
        int bath =0;

        for(int i = 1; i<=n; i++){
            if(i%12 ==0){
                bath +=1;
            }else if( i %3 ==0){
                hall +=1;
            }else if( i%2 ==0){
                cl += 1;
            }
        }
        System.out.print(cl +" "+ hall+" "+ bath);
    }
}