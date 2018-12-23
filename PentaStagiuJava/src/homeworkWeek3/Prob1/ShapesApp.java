package homeworkWeek3.Prob1;

import java.util.Arrays;

import homeworkWeek3.Prob1.Shapes.Circle;
import homeworkWeek3.Prob1.Shapes.Rectangle;
import homeworkWeek3.Prob1.Shapes.Square;
import homeworkWeek3.Prob1.Shapes.Triangle;

public class ShapesApp {

	public static void main(String[] args) {
		Triangle trian = new Shapes().new Triangle(2,2,2,2);
		System.out.println("Perimeter of Triangle is: " + trian.getPerimeterTriangle());
		System.out.println("Area of Triangle is: " + trian.getAreaTriangle()); 
		System.out.println("----------------------- "); 
		
		Circle circ = new Shapes().new Circle(2);
		System.out.println("Area of Circle is: " + circ.getAreaCircle()); 
		System.out.println("----------------------- "); 
		
		Square squar = new Shapes().new Square(2);
		System.out.println("Perimeter of Square is: " + squar.getPerimeterSquare());
		System.out.println("Area of Square is: " + squar.getAreaSquare()); 
		System.out.println("----------------------- "); 
		
		Rectangle rect = new Shapes().new Rectangle(2,2);
		System.out.println("Perimeter of Rectangle is: " + rect.getPerimeterRectangle());
		System.out.println("Area of Rectangle is: " + rect.getAreaRectangle()); 
		System.out.println("----------------------- "); 
		
		double arrMax[] = {rect.getAreaRectangle(), squar.getAreaSquare(), circ.getAreaCircle(), trian.getAreaTriangle()};
		double max = 0;		
		Arrays.sort(arrMax);
		max = max + arrMax[arrMax.length -1];
		System.out.println("Max Area is : " + max);
		
	}

}
 