package abstract_example2;

public class circle extends Shapes{

	public static void main(String[] args) {
		circle c1= new circle();
		c1.goodshape();
		c1.drawshape();
		c1.colourshape();
		c1.moveshape();
	}

	public void drawshape() {
		System.out.println(" Draw a circle");
		
		
	}

	public void colourshape() {
		System.out.println(" colour a circle");
		
	}

	public void moveshape() {
		System.out.println(" Move a circle");
		
	}

}
