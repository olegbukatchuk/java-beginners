import javax.swing.*;
import java.awt.* ;

class Layout extends JFrame {
  JPanel pnl = new JPanel();
  JPanel grid = new JPanel(new GridLayout(2, 2));

  public static void main (String[] args) {
    Window gui = new Window();
  }

  Container contentPane = getContentPane();

  public Layout() {
    super("Окно Swing");
    setSize(500, 200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(pnl);
    setVisible(true);

    pnl.add(new JButton("Да"));
    pnl.add(new JButton("Нет"));
    pnl.add(new JButton("Отмена"));

    grid.add(new JButton("1"));
    grid.add(new JButton("2"));
    grid.add(new JButton("3"));
    grid.add(new JButton("4"));

    contentPane.add("North", pnl);
    contentPane.add("Center", grid);
    contentPane.add("West", new JButton("Запад"));
  }
}
