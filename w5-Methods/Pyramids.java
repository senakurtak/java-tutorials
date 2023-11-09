public class Pyramids {
  public static void main(String[] args) {
    double volume =  pyramidVolume(2, 3);
    System.out.println(volume);
  }

  public static double pyramidVolume(double height, double baseLength)
  {
    double baseArea = baseLength * baseLength;
    return height * baseArea / 3;
  }
}
