import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int cnt =0;
        while(true){
            int a = sc.nextInt();
            
            if(a/10== 2){
            sum+=a;
            cnt++;    
                
            }else{
                System.out.printf("%.2f",(float)sum/cnt);
                break;
            }
        }   
    }
}