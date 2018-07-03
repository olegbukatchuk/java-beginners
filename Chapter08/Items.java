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

  String[] styles = {
    "В глубокой форме",
    "Для гурманов",
    "Тонкая"
  };

  JComboBox<String> box1 = new JComboBox<String>(styles);
  JList<String> lst1 = new JList<String>(toppings);

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

    pnl.add(chk1);
    pnl.add(chk2);
    pnl.add(chk3);
    pnl.add(chk4);

    box1.setSelectedIndex(0);
    
    pnl.add(box1);

    pnl.add(lst1);
  }
}
