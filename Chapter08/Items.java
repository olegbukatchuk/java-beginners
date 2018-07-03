import javax.swing.*;

class Items extends JFrame {
  JPanel pnl = new JPanel();

  public static void main (String[] args) {
    Window gui = new Window();
  }

  String[] toppings = {
    "Пеперони",
    "Грибная",
    "С ветчиной",
    "Томатная"
  };


  JCheckBox chk1 = new JCheckBox(toppings[0]);
  JCheckBox chk2 = new JCheckBox(toppings[1], true);
  JCheckBox chk3 = new JCheckBox(toppings[2]);
  JCheckBox chk4 = new JCheckBox(toppings[3]);

  public Items() {
    super("Окно Swing");
    setSize(500, 200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(pnl);
    setVisible(true);
  }
}
