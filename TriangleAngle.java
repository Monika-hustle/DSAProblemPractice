import java.util.Scanner;
public class TriangleAngle {
    public static void main(String[] args)
    {
           Scanner scan=new Scanner(System.in);
            
           int num1=scan.nextInt();
           int num2=scan.nextInt();
           int num3=scan.nextInt();
           int sum_of_Angles=num1+num2+num3;
           
           
           if(sum_of_Angles==180)
            {
            System.out.println("Triangle can be formed");
           }
           else{
            System.out.println("Triangle cannot be formed");
           }
        
           scan.close();

    }
    
}
