import javax.swing.*;
import java.awt.event.*;

class Sound extends JFrame implements ActionListener {
  JPanel pnl = new JPanel();

  public static void main (String[] args) {
    Sound gui = new Sound();
  }

  ClassLoader ldr = this.getClass().getClassLoader();

  public Sound() {
    super("Окно Swing");
    setSize(500, 200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(pnl);
    setVisible(true);

    pnl.add(playBtn);
    pnl.add(stopBtn);

    playBtn.addActionListener(this);
    stopBtn.addActionListener(this);
  }

  java.applet.AudioClip audio = JApplet.newAudioClip(ldr.getResource("music.wav"));

  JButton playBtn = new JButton("Играть");
  JButton stopBtn = new JButton("Стоп");

  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == playBtn) {
      audio.play();
    }

    if (event.getSource() == stopBtn) {
      audio.stop();
    }
  }
}
