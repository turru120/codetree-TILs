import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double grade;
        double sum=0;
        double avg=0;
        
        for(int i=0;i<n;i++){
            grade= sc.nextDouble();
            sum+= grade;
        }
        avg = sum/n;
        System.out.printf("%.1f \n",avg);

        if(avg>=4){
            System.out.print("Perfect");
        }else if(avg>=3){
            System.out.print("Good");
        }else{
            System.out.print("Poor");
        }

    }
}