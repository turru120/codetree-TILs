import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if(month ==3 || month == 4 || month ==5 ){
            System.out.print("Spring");
        }else if(month ==6 || month == 7 || month ==8 ){
            System.out.print("Summer");
        } else if(month ==9 || month == 10 || month ==11 ){
            System.out.print("Fall");
        } else{
            System.out.print("Winter");
        }


    }
}