import java.util.Scanner;

public class StringsOperations {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Please enter your first name: ");
    String firstName = in.nextLine();
    System.out.print("Please enter your last name: ");
    String lastName = in.nextLine();
    System.out.println("First name: " + firstName + " Last name: " + lastName);
  }
}
