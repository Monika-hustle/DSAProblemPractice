import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int rev=0;//-->initializing reverse
    int original=n;//--->assigning n value because n changes after iteration ,inorder to avoid error we are assigning n to original before iteration itself
    while(n>0){
        int lastDigit=n%10;
        
         rev=rev*10+lastDigit;//--->reversing the number
        n=n/10;
    }
     
    if(rev==original){
        System.out.println("number is palindrome");
    }
    else{
        System.out.println("Not a palindrome");

    }
    
    scan.close();
}
}
