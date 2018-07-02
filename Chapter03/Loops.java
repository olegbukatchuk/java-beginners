class Loops {
  public static void main(String[] args) {
  /*
    if (args.length > 0) {
      for (int i = 0; i < args.length; i++) {
        System.out.println("args[" + i + "] - | " + args[i]);
      }
    }
  */
  
    String[] htm = {
      "HTML5",
      "in",
      "easy",
      "steps"
    };

    int j = 0;

    while (j < htm.length) {
      System.out.println("htm[" + j + "] - | " + htm[j] );
      j++ ;
    }
  }
}
