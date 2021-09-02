package entites;

public class Reactangle {
	
		public double width;
		public double height;
		
		public double area() {
			return width * height;
		}
		
		public double perimeter() {
			return (2.00*width + 2.00*height);
		}
		
		public double diagonal() {
			return (Math.sqrt(width*width + height*height));
		}

}
