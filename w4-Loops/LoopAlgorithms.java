import java.util.Scanner;

public class LoopAlgorithms
{
  public static void main(String[] args) {
    System.out.print("Please input double : ");
    Scanner in = new Scanner(System.in);
    double input = in.nextDouble();
    while (in.hasNextDouble())
    {
       double previous = input;
       input = in.nextDouble();
       if (input == previous)
       {
          System.out.println("Duplicated input!!");
          break;
       } else {
         System.out.println("One more please!!!");
       }
    }
  }
}
