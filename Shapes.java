import java.util.Scanner;
class Shapes1{// parent class
	String s = "shapes";
		
}
class Circle extends Shapes1{//child class of shapes1 
	double getArea(double r) {//find area of circle
		return 3.14 * (r*r);
	}
	void getShape() {
		System.out.println("circle");
	}
	
}
class Square extends Shapes1{//2nd class extends to shapes1
	double getArea(int side) {// find area of square
		return side * side;
	}
	void getShape() {
		System.out.println("square");
	}
	
}

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);// scanner object
		System.out.println("select your shape for finding area press 1 for cicle and  2 for square");
		int user_shape = obj.nextInt();// user choice for selection shapes
		if (user_shape == 1) {
			// condition if user select circle
			Circle c = new Circle();
			System.out.println("enter circle radius");// user enter for radius
			int circle_radius = obj.nextInt();
			System.out.println(c.getArea(circle_radius));//area of circle
			
		}
		else {
		Square s = new Square();// condition if user select square shape
		System.out.println("Enter the side of square");
		int square_side = obj.nextInt();
		System.out.println(s.getArea(square_side));
    s.getShape();
		}

}
}
