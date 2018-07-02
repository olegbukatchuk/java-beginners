class DoWhile {
  public static void main(String[] args) {
    int num = 100;

    do {
      System.out.println("Используем DoWhile: " + num);
    } while (num < 0);

    num += 10;
  }
}
