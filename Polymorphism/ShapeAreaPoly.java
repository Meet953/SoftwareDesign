abstract class Shape {
        protected int width;
        public Shape(int w) { width = w; }
        abstract public int calcArea();
}


class Rectangle extends Shape {

	private int length;
	public Rectangle(int w, int l) {
		super(w);
		length = l;
		 
	}
	
	public int calcArea() {
		return width * length;
		
	}

}


class Square extends Shape {

	public Square(int w) {
		super(w);
		 
	}
	
	public int calcArea() {
		return width * width;
		
	}

}



public class ShapeAreaPoly
{
  public static void main(String[] args)
  {
     Shape []s = new Shape[2];
     s[0] = new Square(5);
     s[1] = new Rectangle(2, 4);
     //s[2] = new Shape(2);
     for (int i = 0; i < 2; i++)
     {
         System.out.println("Area of shape "+(i+1)+":" +  s[i].calcArea());
     }
  }
}
