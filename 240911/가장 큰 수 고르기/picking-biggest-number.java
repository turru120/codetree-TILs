import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int max = 0;
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0;j<10;j++){
            if(arr[j]>max){
                max =arr[j];
            }
        }
        System.out.print(max);
    }
}