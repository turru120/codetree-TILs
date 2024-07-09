import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n ; i++){
            if(n<=10){
                if(i%100 == 5){
                    continue;
                } 
            }else if(i<=100){
                if(i%10 == 5){
                    continue;
                } 
            }else{
                if((i%100)%10 == 5){
                    continue;
                } 
            }
            if(i%2==0 || (i%3==0 && i%9!=0)){

                continue;
            }     
        System.out.print(i+" ");
        }
        
    }
}