import java.util.Scanner;
public class Javaex5{

 public static void main(String args[]) {

     Scanner in = new Scanner(System.in);

     Scanner input = new Scanner (System.in);
    System.out.print("Input first number: ");

    int a = input.nextInt();
    System.out.print("Input second number: ");

    int b = input.nextInt();
    int c = (a*b);

    System.out.println(a+"*"+b+"="+c);
}

}
