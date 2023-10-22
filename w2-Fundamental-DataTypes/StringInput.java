import java.util.Scanner;

public class StringInput {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    //System.out.print("Please enter your name: ");
    //String name = in.next();
    //System.out.println("Hello, " + name + "!");

  //  System.out.print("Please enter your address: ");
  //  String address = in.nextLine(); // he nextLine method reads until the user hits ‘Enter’
  //  System.out.println(address);

      System.out.print("Please enter your age: ");
      String input = in.nextLine();
      int age = Integer.parseInt(input); // only digits!
      System.out.println(age);
  }
}
