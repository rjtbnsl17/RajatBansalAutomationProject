package Weather;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.Rectangle;

public class RectangleObject extends Rectangle {
	Rectangle rect;

	@BeforeClass

	public void ObjectInstantiate() {

		rect = new Rectangle();

	}

	@Test

	public void SetFile() {

		rect.RectangleSet(3, 4);
		SerializeToFile(rect, "rectSerialized");
		rect = (Rectangle) DeSerializeFromFileToObject("rectSerialized");
		System.out.println("Rect area is " + rect.Area());
		System.out.println("Perimeter area is " + rect.Perimeter());
	}

}
