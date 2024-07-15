import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;


        for(int i=1;i<=n;i++){
            if(n/i<=1){
                cnt ++;        
                break;
            }else{
                cnt++;
                n =n/i;
            }
        }
        cnt++;
        System.out.print(cnt);
    }
}