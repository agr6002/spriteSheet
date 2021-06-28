package tym.app.model;

import tym.app.App;

public class Model {

  private App app;
  public Horse horse = new Horse();

  public Model(App app) {
	System.out.println("Constructing Model.");
	this.app = app;
  }
}
