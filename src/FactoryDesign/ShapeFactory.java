package FactoryDesign;

public class ShapeFactory {

	public Shape getInstance(String shape) {
		Shape obj = null;
		switch (shape) {
		case "circle":
			obj = new Circle();
			break;
		case "triangle":
			obj = new Triangle();
			break;
		case "rectangle":
			obj = new Rectangle();
			break;
		default:
			break;
		}
		return obj;
	}
}
