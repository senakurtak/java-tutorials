public class StringsCharacters {
  public static void main(String[] args) {
    char initial = 'B';
    String initials = "BRL";

    String greeting = "Sena";
    char start = greeting.charAt(0);
    char last = greeting.charAt(3);
    System.out.println(start);
    System.out.println(last);

    String sub = greeting.substring(0, 2);
    System.out.println(sub);

    String sub2 = greeting.substring(1, 3);
    System.out.println(sub2);
  }
}
