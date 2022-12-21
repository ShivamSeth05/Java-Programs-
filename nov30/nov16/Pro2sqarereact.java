package nov16;

class Square{
	int squareArea(int side) {
		return side * side;
	}
	int squareParemeter(int side) {
		return 4 * side;
	}	
}

class RectAngle{
	int rectAngleArea(int length,int breath) {
		return length * breath;
	}
	int rectAngleParemeter(int length,int breath) {
		return 2*(length* breath);
	}	
}
public class Pro2sqarereact {

	public static void main(String[] args) {
		Square ob1 = new Square();
		System.out.println("Sqare:");
		System.out.printf("Area is %d",ob1.squareArea(4));
		
		System.out.printf("\nParameter is %d",ob1.squareParemeter(4));
		RectAngle ob2 = new RectAngle();
		System.out.printf(" \nReactangle :\nArea is %d",ob2.rectAngleArea(4,2));
		System.out.printf("\nParameter is %d",ob2.rectAngleParemeter(4,3));

	}

}
