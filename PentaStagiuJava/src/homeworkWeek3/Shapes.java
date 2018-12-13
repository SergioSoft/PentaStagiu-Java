package homeworkWeek3;

public class Shapes {
	public class Circle{
		private int r;
		public Circle(int radius) {
			this.r = radius;			
		}
		
		public double getAreaCircle(){
			return Math.PI * r * r;
		}
	
	}
	public class Square{
		private int a;
		public Square(int side){
			this.a = side;
		}
		
		public long getAreaSquare() {
			return a * a;
		}
		public long getPerimeterSquare() {
			return 4*a;
		}
	}
	public class Triangle{
		private int a, b, c;
		private int h;
		
		public Triangle(int sideA, int base, int sideC, int height) {
			this.a = sideA;
			this.b = base;
			this.c = sideC;
			this.h = height;
		}
		public long getPerimeterTriangle(){
			return a+b+c;
		}
		public long getAreaTriangle(){
		return (h * b) / 2;
		}
	}
	public class Rectangle{
		private int l , w;
			public Rectangle(int length , int weight) {
				this.l = length;
				this.w = weight;
			}
			public long getPerimeterRectangle() {
				return 2 * (l + w);
			}
			public long getAreaRectangle() {
				return l * w;
			}
	}
}
