import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean sat = true;
       
        for(int i=2;i<n;i++){
            if(n%i==0){
                sat = false;
            }
        }
        if(sat==true){
            System.out.print("P");
        } 
        else{
            System.out.print("C");
        }
    }
}