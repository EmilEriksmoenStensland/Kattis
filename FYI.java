import java.util.Scanner;
class FYI {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    String[] num = key.nextLine().split("");
    if (num[0].equals("5") && num[1].equals("5") && num[2].equals("5")) {
      System.out.println("1");
    }
    else {
      System.out.println("0");
    }
  }
}
