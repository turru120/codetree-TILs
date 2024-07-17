import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean sat = false;

        for(int i =2; i<=n-1;i++){
            if(n%1==0){
                sat =true;
            }
        }

        if(sat==true){
            System.out.print("C");
        }
    
        else{
            System.out.print("N");
        }
    }
}