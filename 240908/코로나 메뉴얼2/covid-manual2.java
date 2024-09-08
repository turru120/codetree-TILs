import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String []arr =new String [2];

        int A =0;
        int B =0;
        int C =0;
        int D =0;

        for(int j=0;j<3;j++){
            for(int i=0;i<2;i++){
                arr[i] = sc.next();
            }
            if(arr[0].equals("Y")){
                if(Integer.parseInt(arr[1])>=37){
                    A++;
                }else{
                    C++;
                }
            }else{
                if(Integer.parseInt(arr[1])>=37){
                    B++;
                }else{
                    D++;
                }
            }
        }
        System.out.printf("%d %d %d %d ",A,B,C,D);
        if(A>=2){
            System.out.print("E");
        }
    }
}