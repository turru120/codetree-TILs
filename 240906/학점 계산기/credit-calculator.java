import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n =sc.nextDouble();
        double[] arr = new double[5];
        double sum=0;
      

        for(int i=0;i<n;i++){
            arr[i] = sc.nextDouble();
                sum+=arr[i];
        } 
        double ave=sum/n;
        System.out.printf("%.1f%n",ave);
        if(ave>=4){
            System.out.println("Perfect");
        }else if(ave>=3){
            System.out.println("Good");
        }else{
            System.out.println("Poor");
        }
      
    }
}