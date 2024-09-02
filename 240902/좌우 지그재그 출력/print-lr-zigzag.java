import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt =-n+1;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n;j++){
                
                if(j==1){
                        cnt+=n;
                }else{
                    if(i%2!=0){
                        cnt++;
                    }else{
                           cnt--;
                    }
                }
                System.out.print(cnt+" ");
            }
            System.out.println();
        }
    }
}