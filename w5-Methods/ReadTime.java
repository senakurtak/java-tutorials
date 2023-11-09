import java.util.Scanner;

public class ReadTime
{

  /**
Prompts a user to enter a value in a given range until the user provides a valid input.
@param low the low end of the range
@param high the high end of the range
@return the value provided by the user
*/

public static void main(String[] args) {
  readIntBetween(1, 100);
}

public static int readIntBetween(int low, int high)
{
  int input;
  do {
    System.out.print("Enter between " + low + " and " + high + ": ");
    Scanner in = new Scanner(System.in);
    input = in.nextInt();
  }
  while (input < low || input > high);
  return input;
}

}
