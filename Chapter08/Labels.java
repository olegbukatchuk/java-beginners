import javax.swing.*;

class Labels extends JFrame {
  JPanel pnl = new JPanel();

  public static void main (String[] args) {
    Window gui = new Window();
  }

  //ImageIcon duke = new ImageIcon("duke.png");

  ImageIcon duke = new ImageIcon( ldr.getResource("duke.png"));

  JLabel lbl1 = new JLabel(duke);
  JLabel lbl2 = new JLabel("Дюк — талисман технологии Java.");
  JLabel lbl3 = new JLabel("Дюк", duke, JLabel.CENTER);

  //lbl3.setHorizontalTextPosition(JLabel.CENTER);
  //lbl3.setVerticalTextPosition(JLabel.BOTTOM);
  ClassLoader ldr = this.getClass().getClassLoader();

  public Labels() {
    super("Окно Swing");
    setSize(500, 200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(pnl);
    setVisible(true);

    lbl1.setToolTipText("Дюк — талисман Java");

    pnl.add(lbl1);
    pnl.add(lbl2);
    pnl.add(lbl3);
  }
}
