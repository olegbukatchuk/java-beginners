class Overload {
  public static void main(String[] args) {
    String txt = "Это локальная переменная метода main" ;

    System.out.println(txt);
    System.out.println(write(12));
    System.out.println(write("Двенадцать"));
    System.out.println(write(4, 16));

    System.out.println(Scope.txt);
  }

  final static String txt = "Это глобальная переменная класса Scope";

  public static String write(int num) {
    return ("Переданное целое " + num);
  }

  public static String write(String num) {
    return ("Переданное строковое " + num);
  }

  public static String write(int num1, int num2) {
    return ("Результат равен " + (num1 * num2));
  }
}
