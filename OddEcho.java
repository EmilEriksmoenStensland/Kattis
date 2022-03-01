import java.util.Scanner;
class OddEcho {
  public static void main(String[] args) {
      Scanner key = new Scanner(System.in);

      int n = key.nextInt();
      for (int i = 1; i <= n; i++) {
        String mid = key.next();
        if (i % 2 != 0) {
          System.out.println(mid);
        }
      }
  }
}
