import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt3 = 0;
        int cnt5 = 0;
        
        for(int i =1; i<=10; i++){
            int a = sc.nextInt();

            if(a %3 ==0 && a%5 ==0){
                cnt3 +=1;
                cnt5 +=1;
            }else if(a%3 ==0){
                cnt3 +=1;
            }else if(a%5 ==0){
                cnt5 +=1;
            }
        }
        
        System.out.print(cnt3 +" " + cnt5);
    }
}