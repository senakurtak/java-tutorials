public class PowerTable
{

  public static void main(String[] args) {
    final int NMAX = 4;
    final double XMAX = 10;

    for (double x = 1; x <= XMAX; x++)
      {
        for (int n = 1; n <= NMAX; n++)
        {
          System.out.printf("%10.0f", Math.pow(x, n));
        }
        System.out.println();
    }
  }
}
