import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[4];
        int cnt=0;

        for(int j=0;j<n;j++){
        int sum=0;
            for(int i=0; i<4; i++){
                arr[i]= sc.nextInt();
                sum+= arr[i];
            } 
            float avg= (float)sum/4;
            if(avg>=60){
                System.out.println("pass");
                cnt++;
            }else{
                System.out.println("fail");
            }
        }
        System.out.print(cnt);
    }
}