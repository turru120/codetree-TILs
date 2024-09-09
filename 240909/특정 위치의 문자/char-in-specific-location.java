import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[6];
        arr[0] = 'L';
        arr[1] = 'E';
        arr[2] = 'B';
        arr[3] = 'R';
        arr[4] = 'O';
        arr[5] = 'S';
        char c = sc.next().charAt(0);
        int idx = -1;
        for(int i =0;i<6;i++){
            if(arr[i]==c){
                idx =i;
            }
        }
        if(idx==-1){
            System.out.print("None");
        }else{
            System.out.print(idx);
        }
        
    }
}