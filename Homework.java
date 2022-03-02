import java.util.Scanner;
class Homework {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    String[] tasks = key.nextLine().split(";");
    int totalTasks = 0;
    for (int i = 0; i < tasks.length; i++) {
      String[] mid = tasks[i].split("-");
      if (mid.length == 1) {
        totalTasks++;
      }
      else {
        int a = Integer.parseInt(mid[0]);
        int b = Integer.parseInt(mid[1]);
        for (int e = a; e <= b; e++) {
          totalTasks++;
        }
      }
    }
    System.out.println(totalTasks);
  }
}
