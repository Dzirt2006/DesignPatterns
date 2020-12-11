package FactoryDesign;

import org.testng.annotations.Test;

public class EntryPoint {
  @Test
  public void f() {
	  ShapeFactory factory=new ShapeFactory();
	  Shape obj=factory.getInstance("triangle");
	  obj.draw();
  }
}
