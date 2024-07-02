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

/*해설

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        char c1, c2, c3;
        int t1, t2, t3;
        
        // 입력
        c1 = sc.next().charAt(0);
        t1 = sc.nextInt();
        c2 = sc.next().charAt(0);
        t2 = sc.nextInt();
        c3 = sc.next().charAt(0);
        t3 = sc.nextInt();

        // 출력
        // A가 2명 이상인지 판단하기
        if(c1 == 'Y' && t1 >= 37) {
            // 첫 번째 사람이 A라면, 남은 두 사람 중 한 사람이라도 A면 됩니다.
            if((c2 == 'Y' && t2 >= 37) || (c3 == 'Y' && t3 >= 37))
                System.out.println("E");
            else
                System.out.println("N");
        }
        else {
            // 첫 번째 사람이 A가 아니라면, 남은 두 사람 모두 A여야만 합니다.
            if((c2 == 'Y' && t2 >= 37) && (c3 == 'Y' && t3 >= 37))
                System.out.println("E");
            else
                System.out.println("N");
        }
    }
}



*/