public class StringBoxes {

  public static void main(String[] args) {
    boxString("imdat");
  }

  public static void boxString(String str)
  {
    int n = str.length();
    for (int i = 0; i < n + 2; i++)
    { System.out.print("-"); } System.out.println(); System.out.println("!" + str + "!"); for (int i = 0; i < n + 2; i++)
    { System.out.print("-"); } System.out.println();
  }
}
