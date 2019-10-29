class Area{
	int length,breadth;
	Area(){
		length=10;
		breadth=20;
	}
}
class Triangle extends Area{
	double ar=0;
	void area(){
		ar=0.5*length*breadth;
	}
	void display(){
		System.out.println("Area is :"+ar);
	}
}
class SingleInheritance{
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.area();
		t.display();
	}
}