import java.util.Scanner;
public class Javaex1{

 public static void main(String args[]) {
   float temperatue;
     Scanner in = new Scanner(System.in);

     System.out.println("Enter temperatue in Fahrenheit");
     temperatue = in.nextInt();

     temperatue = ((temperatue - 32)*5)/9;

     System.out.println("212.0 degree Fahrenheit is equal to " + temperatue+"");
}

}
