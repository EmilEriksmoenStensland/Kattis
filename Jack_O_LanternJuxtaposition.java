import java.util.Scanner;
class Jack {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    int n = key.nextInt();
    int t = key.nextInt();
    int m = key.nextInt();
    System.out.println(n*t*m);
  }
}
