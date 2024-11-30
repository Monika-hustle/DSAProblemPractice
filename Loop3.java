import java.util.Scanner;
public class Loop3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String firstname=scan.nextLine();
        String lastname=scan.nextLine();
        String Fullname=firstname+lastname;
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(Fullname);
        }
    scan.close();
    }
}
