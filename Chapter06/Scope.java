class Scope {
  public static void main(String[] args) {
    String txt = "Это локальная переменная метода main";
    System.out.println(txt);

    sub();
  }

  public static void sub() {
    String txt = "Это локальная переменная метода sub";
    System.out.println(txt);
  }
}
