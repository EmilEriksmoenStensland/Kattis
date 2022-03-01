import java.util.Scanner;
import java.io.*;
import java.util.*;
class MagicTrick {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    String[] a = key.nextLine().split("");
    int aSize = a.length;
    Set<String> b = new LinkedHashSet<String>(Arrays.asList(a));
    int bSize = b.size();
    if (aSize == bSize) {
      System.out.println("1");
    }
    else {
        System.out.println("0");
    }
  }
}
