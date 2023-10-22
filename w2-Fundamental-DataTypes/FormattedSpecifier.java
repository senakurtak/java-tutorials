public class FormattedSpecifier {
  public static void main(String[] args) {

    double price = 1.22; // Use double

    System.out.printf("%.2f", price); // 2 spaced filled on 10 spaces on leading
    System.out.printf("%10.2f", price); // 2 spaces filled on 10 spaces on trailing
    System.out.printf("%-10s", "Total:"); // Left justify a string
    System.out.printf("%10.2f", price); // Right justify a string
    System.out.printf("%-10s%10.2f", "Total:", price); // total leading justified, price trailing justified

  }
}
