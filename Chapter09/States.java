import java.awt.event.* ;
import javax.swing.*;

class States extends JFrame implements ItemListener {
  JPanel pnl = new JPanel();

  public static void main (String[] args) {
    Window gui = new Window();
  }

  String[] styles = {
    "В глубокой форме",
    "Для гурманов",
    "Тонкая"
  };

  JComboBox<String> box = new JComboBox<String> ( styles );

  JRadioButton rad1 = new JRadioButton("Белое");
  JRadioButton rad2 = new JRadioButton("Красное");
  ButtonGroup wines = new ButtonGroup();
  JCheckBox chk = new JCheckBox("Пеперони");
  JTextArea txtArea = new JTextArea(5, 38);

  public States() {
    super("Окно Swing");
    setSize(500, 200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(pnl);
    setVisible(true);

    wines.add(rad1);
    wines.add(rad2);

    pnl.add(rad1);
    pnl.add(rad2);
    pnl.add(chk);
    pnl.add(box);
    pnl.add(txtArea);

    rad1.addItemListener(this);
    rad2.addItemListener(this);
    chk.addItemListener(this);
    box.addItemListener(this);
  }

  public void itemStateChanged(ItemEvent event) {
    if (event.getItemSelectable() == rad1) {
      txtArea.setText("Выбрано белое вино");

      if (event.getItemSelectable() == rad2) {
        txtArea.setText("Выбрано красное вино");
      }
    }

    if ((event.getItemSelectable() == chk) && (event.getStateChange() == ItemEvent.SELECTED)) {
      txtArea.append("\nВыбрана Пеперони\n");
    }

    if ((event.getItemSelectable() == box) && (event.getStateChange() == ItemEvent.SELECTED)) {
      txtArea.append("Выбрана" + event.getItem().toString());
    }
  }

}
