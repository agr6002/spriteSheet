package tym.app.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JPanel;

import tym.app.App;

public class View extends JPanel {

  private static final long serialVersionUID = 1L;

  private App app;

  public View(App app) {
	System.out.println("Constructing View.");
	this.app = app;
	setPreferredSize(new Dimension(800, 520));
	setBackground(new Color(200, 255, 200));
  }

  @Override
  public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2d = (Graphics2D) g;
	g2d.drawLine(0, 0, 800, 520);
	app.model.horse.paint(g2d);
	Toolkit.getDefaultToolkit().sync();
	g2d.dispose();
  }

}
