import java.util.Scanner;
public class Javaex2{

  public static void main(String[] Strings) {
double inch;
double meters;

         Scanner input = new Scanner(System.in);

         System.out.print("Input a value for inch: ");
          inch = input.nextDouble();
          meters = ((inch)* 0.0254);
         System.out.println(inch + " inch is " + meters + " meters");
}

}
