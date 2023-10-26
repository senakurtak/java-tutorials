import java.util.Scanner;
public class EathquakeStrength
{
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter scale ");
  double richter = in.nextDouble();
  {
    System.out.print("Enter scale ");
    if (richter >= 8){
      System.out.println("Most structures fall");
    } else if (richter >= 7) {
      System.out.println("Many buildings destroyed");
    } else if (richter >= 6.0)
  {
  System.out.println("Many buildings damaged, some collapse");
  }
  else if (richter >= 4.5) {
  System.out.println("Damage to poorly constructed buildings");
  }
  else // so that the ‘general case’ can be handled last {
  System.out.println("No destruction of buildings");
  }
}
}
