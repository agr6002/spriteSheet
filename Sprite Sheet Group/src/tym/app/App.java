package tym.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

import tym.app.model.Model;
import tym.app.view.View;

public class App extends JFrame implements ActionListener {

  private static final long serialVersionUID = 1L;
  private static final int TIMER_INTERVAL = 100;

  public Model model;
  private View view;
  private Timer timer;

  public App() {
	System.out.println("Constructing App.");
	model = new Model(this);
	view = new View(this);
	timer = new Timer(TIMER_INTERVAL, this);
	add(view);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pack();
	setLocationRelativeTo(null);
	setTitle("Sprite Sheet");
	setVisible(true);
	timer.start();
  }

  @Override
  public void actionPerformed(ActionEvent arg0) {
	  view.repaint();
  }

}
