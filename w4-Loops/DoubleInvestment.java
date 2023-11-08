public class DoubleInvestment
{
  public static void main(String[] args)
  {
    final double RATE = 5;
    final double INITIAL_BALANCE = 1000;
    final double TARGET = 2 * INITIAL_BALANCE;

    double balance = INITIAL_BALANCE;
    int year = 0;

    while (balance<TARGET)
    {
      System.out.println(year);
      System.out.println(balance);
      year++;
      double interest = balance * RATE / 100;
      balance = balance + interest;
    }

    System.out.println("The investment doubled after " + year + " years.");
  }
}
