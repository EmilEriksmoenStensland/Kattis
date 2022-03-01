import java.util.Scanner;
class SortTwoNumbers {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    int a = key.nextInt();
    int b = key.nextInt();
    if ( a > b) {
      System.out.println(b + " " + a);
    }
    else {
        System.out.println(a + " " + b);
    }
  }
}
