package object.clone;

public class CircleMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Point point = new Point(3, 4);
		System.out.println(point);
		
		Circle circle = new Circle(5, 6, 4);
		System.out.println(circle);
		
		//circle 객체 복사
		Circle copycCircle = (Circle)circle.clone(); //형변환
		System.out.println(copycCircle);
	}

	
}

