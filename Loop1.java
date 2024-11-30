import java.util.Scanner;
public class Loop1 {
    public static void main(String[] args){
     Scanner scan=new Scanner(System.in);
     int x=scan.nextInt();
     int y=scan.nextInt();
     System.out.println("The output is:");
     for(int i=0;i<y;i++){
        System.out.println(x);
     }
     scan.close();
    }
    
}
