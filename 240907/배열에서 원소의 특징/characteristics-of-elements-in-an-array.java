import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt=-1;
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
            cnt++;
            if(arr[i]%3==0){
                break;
            }
        } 
        System.out.print(arr[cnt-1]);
    }
}