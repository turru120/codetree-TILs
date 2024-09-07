import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int evensum=0;   //짝수 번째로 입력된 값의 합
        int sum3=0;      // 3의 배수 번째로 입력된 값의 합
        int cnt=0;
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<10;i+=2){
            evensum+= arr[i];
        }
        for(int i=2;i<10;i+=3){
            sum3 += arr[i];
            cnt++;
        }
        System.out.printf("%d %.1f",evensum,((double)sum3/cnt));
    }
}