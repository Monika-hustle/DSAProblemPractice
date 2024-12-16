import java.util.Scanner;
public class Num_of_digits {
    public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       int count=0;
       while(n>0){
        int lastDigit=n%10;
        count=count+1; 
        n=n/10;
       }
       System.out.println(count);
       scan.close();
    }
    
}
