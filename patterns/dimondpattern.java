public class dimondpattern {
  public static void main(String[] args) {
    int n = 15, star = 1, space = n / 2 + 1;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= space; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= star; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // if (i < n / 2) {
    // space--;
    // star += 2;
    // } else {
    // space++;
    // star -= 2;
    // }
    // }

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= space; j++) {

        System.out.print("  ");

      }
      for (int j = 1; j <= star; j++) {
        System.err.print("* ");
      }
      System.err.println();
      if (i < n / 2) {
        space--;
        star += 2;
      } else {
        space++;
        star -= 2;
        ;
      }
    }
  }
}
