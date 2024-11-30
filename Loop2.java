import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(); 
         System.out.println("THE MULTIPLIED VALUES ARE:");
        for (x = 100; x <= 1000; x +=100) { 
            
            System.out.println(x);
        }

       // for(int i=100;i<=1000;i=i+100){
          //  System.out.println(i);
        ///}

    scan.close();
    }

    
}
