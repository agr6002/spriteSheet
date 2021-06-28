package tym;

import java.awt.EventQueue;

import tym.app.App;

public class Main {

  public static void main(String[] args) {
	EventQueue.invokeLater(() -> {
	  new App();
	});
  }

}