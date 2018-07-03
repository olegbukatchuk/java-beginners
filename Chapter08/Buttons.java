import javax.swing.*;

class Buttons extends JFrame {
  JPanel pnl = new JPanel();

  public static void main (String[] args) {
    Window gui = new Window();
  }

  ImageIcon tick = new ImageIcon("tick.png");
  ImageIcon cross = new ImageIcon("cross.png");

  JButton btn = new JButton("Нажми меня");
  JButton tickBtn = new JButton(tick);
  JButton crossBtn = new JButton("СТОП", cross);

  ClassLoader ldr = this.getClass().getClassLoader();

  java.net.URL tickURL = ldr.getResource("tick.png");
  java.net.URL crossURL = ldr.getResource("cross.png");

  public Buttons() {
    super("Окно Swing");

    setSize(500, 200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(pnl);
    setVisible(true);

    pnl.add(btn);
    pnl.add(tickBtn);
    pnl.add(crossBtn);
  }
}
