import java.util.Scanner;
class RatingProblems {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    int judges = key.nextInt();
    int ratings = key.nextInt();
    int totalScore = 0;
    for (int i = 0; i < ratings; i++) {
      totalScore += key.nextInt();
    }
    float minScore = totalScore;
    float maxScore = totalScore;
    for (int i = ratings; i < judges; i++) {
      minScore -= 3f;
      maxScore += 3f;
    }
    System.out.println(minScore/judges + " " + maxScore/judges);
  }
}
