import java.awt.event.* ;
import javax.swing.*;

class Keystrokes extends JFrame implements Keylistener {
  JPanel pnl = new JPanel();

  public static void main (String[] args) {
    Keystrokes gui = new Keystrokes();
  }

  JTextField field = new JTextField(38);
  JTextArea txtArea = new JTextArea(5, 38);

  public Keystrokes() {
    super("Окно Swing");
    setSize(500, 200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(pnl);
    setVisible(true);

    pnl.add(field);
    pnl.add(txtArea);

    field.addKeyListener(this);
  }

  public void keyPressed(KeyEvent event) {
    txtArea.setText("Нажата клавиша");
  }

  public void keyTyped(KeyEvent event) {
    txtArea.append("\nСимвол : " + event.getKeyChar());
  }

  public void keyReleased(KeyEvent event) {
    int keyCode = event.getKeyCode();
    txtArea.append("\nКод клавиши : " + event.getKeyCode());
    txtArea.append("\nТекст клавиши :" + event.getKeyText(keyCode));
  }
}
