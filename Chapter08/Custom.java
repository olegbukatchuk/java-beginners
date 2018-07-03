import javax.swing.*;
import java.awt.* ;

class Custom extends JFrame {
  JPanel pnl = new JPanel();

  public static void main (String[] args) {
    Window gui = new Window();
  }

  JLabel lbl1 = new JLabel("Пользовательский задний фон");
  JLabel lbl2 = new JLabel("Пользовательский передний фон");
  JLabel lbl3 = new JLabel("Пользовательский шрифт");

  Color customColor = new Color(255, 0, 0);
  Font customFont = new Font("Serif", Font.PLAIN, 32);

  public Custom() {
    super("Окно Swing");
    setSize(500, 200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(pnl);
    setVisible(true);

    lbl1.setOpaque(true);
    lbl1.setBackground(Color.YELLOW);

    lbl2.setForeground(customColor);
    lbl3.setFont(customFont);

    pnl.add(lbl1);
    pnl.add(lbl2);
    pnl.add(lbl3);

  }
}
