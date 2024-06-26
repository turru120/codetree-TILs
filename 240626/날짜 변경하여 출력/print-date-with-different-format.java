import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\.");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        System.out.printf("%d-%d-%d",month,day,year);
    }
}

// useDelimiter 안에 적어야 하는 내용은 실제 정규 표현식 (Regular expression)이기에, "." 문자를 문자 그대로 사용하고 싶을시 "\"를 붙여야 함