import java.util.Scanner;
class Nsum {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    int n = key.nextInt();
    int total = 0;
    for (int i = 0; i < n; i++) {
      total += key.nextInt();
    }
    System.out.println(total);
  }
}
