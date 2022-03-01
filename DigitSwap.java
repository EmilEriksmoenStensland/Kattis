import java.util.Scanner;
class DigitSwap {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    String[] mid = key.nextLine().split("");
    System.out.println(mid[1] + "" + mid[0]);
  }
}
