package structuralPatterns.Flyweight.PaintApp;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

	private static Map<String, Shape> mapShapes = new HashMap<String, Shape>();

	public static Shape getShape(String type) {
		Shape shape = null;

		if (mapShapes.containsKey(type)) {
			shape = mapShapes.get(type);
		} else {
			if (type.equals("circle"))
				shape = new Circle();
			else if (type.equals("rectangle"))
				shape = new Rectangle();

			mapShapes.put(type, shape);
		}
		return shape;
	}
}
