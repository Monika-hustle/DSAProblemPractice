import java.util.Scanner;
public class Else_if{
    public static void main(String[] args) {
        Scanner mark=new Scanner(System.in);
         int Grade=mark.nextInt();
         
         
         if(Grade>=90){
              System.out.println("Grade A");
         }
         else if(Grade>=80){
            System.out.println("Grade B");
         }
         else if(Grade>=60){
            System.out.println("Grade B");
         }
         else if(Grade>=35){
            System.out.println("Grade B");
         }
         else{
            System.out.println("Fail");
         }
        mark.close();
    }
}