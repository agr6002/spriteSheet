package tym.app.model;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

public class Horse {

  private static final String SPRITE_SHEET_SRC = "src/tym/app/resources/birdSpriteSheet.png";
  private static final Image IMAGE = Toolkit.getDefaultToolkit().getImage(SPRITE_SHEET_SRC);

  private Image image;
  private int row = 0;
  private int col = 0;
  public int colMax = 4;//20;
  public int rowMax = 3;//20;
  private int dimX = 605; // 100;
  private int dimY = 442; // 100;
  private int posX = 400;
  private int posY = 260;

  public Horse() {
	image = IMAGE;
  }

  public void paint(Graphics2D g2d) {
	g2d.drawImage(image, 350, 210, 450, 310, dimX * col, dimY * row, dimX * (col + 1), dimY * (row + 1), null);
	col += 1;
	if (col == colMax) {
		col = 0;
		row += 1;
	}
	if (row == rowMax) {
		row = 0;
	}
	// g2d.translate(posX, posY);
//	g2d.drawImage(image, 0, 0, 100, 100, (int) Math.round(-0.5 * dimX), (int) Math.round(-0.5 * dimY), dimX, dimY,
//		null);
	// g2d.translate(-posX, -posY);
  }

}
