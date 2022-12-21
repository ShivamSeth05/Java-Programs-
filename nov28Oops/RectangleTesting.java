/*
 * Program-3
==========
 A Class Rectangle is given to you. Implement the following features in the class.


   1. Add fields x1,y1,x2,y2 as int variables to the class. 
   These points represent the bottom-left corner (x1,y1) and 
   the top-right corner(x2,y2) of the rectangle.

   2. A default constructor is given to you.

   3. Add a constructor that takes x1,y1,x2,y2 as parameters.

   4. Add a constructor that takes width and height as int type parameters.
    This constructor should set (x1,y1) as (0,0) and 
    calculate the (x2,y2) based on the given width and height..

   5. Implement the method getHeight(): this method should calculate 
   the height of the rectangle based on the points x1,y1,x2,y2 and return it as an int.

   6. Implement the method getWidth(): this method should calculate the width of
    the rectangle based on the points x1,y1,x2,y2 and return it as an int.

   7. Implement the method getArea(): this method should calculate the area of 
   the rectangle based on the points x1,y1,x2,y2 and return it as an int.

   8. Implement the method getPerimeter(): this method should calculate 
   the perimeter of the rectangle based on the points x1,y1,x2,y2 and return it as an int.

   9. Implement the method isPointInside(int pointx, int pointy): 
   this method should check if the given point (pointx, pointy) will fall inside 
   the rectangle or outside. Note that any point on the rectangle edge/corner is 
   also inside the rectangle. If this point falls inside return true, else return false.

  10. Implement a method move(int deltax, int deltay): this method should move 
  the entire rectangle(all the points) by the given amounts deltax and deltay. 
  Set the new values of x1,y1,x2 and y2.


A class RectangleTesting is given to you with a main method. Create rectangle 
objects here and test its methods with various inputs.
 */
package nov28Oops;
class Rectangle{
	int x1,y1,x2,y2 ;
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	int getHeight() {
		
		return y2;
	}
	
	int getWidth() {
		
		return y2;
	}
	
	int getArea() {
		
		return y2;
	}
	
	int getPerimeter() {
		
		return y2;
	}
	
	int isPointInside(int pointx, int pointy) {
		
		return y2;
	}
	
	int move(int deltax, int deltay) {
		
		return y2;
	}
}
public class RectangleTesting {

	public static void main(String[] args) {
		Rectangle ob = new Rectangle(0, 0, 3, 5);
		
	}

}
