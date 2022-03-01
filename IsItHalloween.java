import java.util.Scanner;
class IsItHalloween {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    String mid = key.nextLine();
    if (mid.equals("OCT 31") || mid.equals("DEC 25")) {
      System.out.println("yup");
    }
    else {
      System.out.println("nope");
    }
  }
}
