import java.util.Scanner;
public class LastDigit {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int A=scan.nextInt();
        int B=scan.nextInt();
        int K=scan.nextInt();
        long power=(long)Math.pow(A,B);//-->function used to find power
        System.out.println("The power value of A and B:"+power);
        while(K>0){
            long id=power%10;
            System.out.println("The last Digit is:"+id);
            power=power/10;
            K--;
            

        }
       
        scan.close();
    }
  
    
}
