public class pattern4 {
  public static void main(String[] args) {
    int n = 11;
    for (int i = 0; i < n; i++) {
      // for (int spac = 0; spac <= i; spac++) {
      // System.out.print(" ");
      // }
      // for (int j = 0; j <= n - i; j++) {
      // System.out.print("*");
      // }
      for (int j = 0; j < n; j++) {
        if (j < i) {
          System.out.print(" ");
        } else {
          System.out.print('*');
        }
      }
      System.out.println();
    }
  }
}
