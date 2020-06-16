public class TriangleExam {

	public static void main(String[] args) {
		Triangle c = new Triangle(10.2, 17.3);
		System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ : >>" + c.getArea());
		c.setSize(7.5, 9.2);
		System.out.println("»ï°¢ÇüÀÇd ³ÐÀÌ : >>" + c.getArea());
	}
}	
class Triangle{
	double a, b;
	public Triangle(double ab, double cd) {
		a=ab;
		b=cd;
	}
	public void setSize(double ab, double cd) {
		a=ab;
		b=cd;
	}
	public double getArea() {
		return a*b/2;
	}
}