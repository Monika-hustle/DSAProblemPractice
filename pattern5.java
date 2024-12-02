import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();

        for(int i=1;i<=N;i++){
            for(int j=1;j<=(N-i)+1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        scan.close();
    }
}
