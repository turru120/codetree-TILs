import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c_1 = sc.next().charAt(0);   //감기증상 유무
        int t_1 = sc.nextInt();           //체온
        char c_2 = sc.next().charAt(0);
        int t_2 = sc.nextInt();
        char c_3 = sc.next().charAt(0);
        int t_3 = sc.nextInt();
        char a_1=' ', a_2=' ',a_3=' ';    //구분 

    
        if (t_1 >=37){
            if(c_1 =='Y'){
                a_1 = 'A';
            }else{
                   a_1 = 'B';
            }
        }else{
            if(c_1 =='Y'){
                a_1 = 'C';
            }else{
                a_1 = 'D';
            }
        }

          if (t_2 >=37){
            if(c_2 =='Y'){
                a_2 = 'A';
            }else{
                   a_2 = 'B';
            }
        }else{
            if(c_2 =='Y'){
                a_2 = 'C';
            }else{
                a_2 = 'D';
            }
        }

          if (t_3>=37){
            if(c_3 =='Y'){
                a_3 = 'A';
            }else{
                   a_3 = 'B';
            }
        }else{
            if(c_3 =='Y'){
                a_3 = 'C';
            }else{
                a_3 = 'D';
            }
        }
        
        if((a_1 == 'A' && a_2  ==  'A' && a_3 == 'A')|| (a_1 =='A' && a_2 == 'A' )|| (a_1 == 'A' &&  a_3 == 'A') || (a_2 == 'A'&& a_3 =='A')){
            System.out.print("E");
        }else{
            System.out.print("N");
        }
    }
}