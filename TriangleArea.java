import java.util.Scanner;
class TriangleArea {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    float height = (float) key.nextInt();
    float base = (float) key.nextInt();
    System.out.println(height * (base/2));
  }
}
