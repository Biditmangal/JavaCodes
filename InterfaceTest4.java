interface course
{
	void division(int a);
	void modulus(int b);
}
class student implements course
{
	String name;
	int div,mod;
	void name(String n){
		name=n;
	}
	public void division(int a){
		div=a;
	}
	public void modulus(int b){
		mod=b;
	}
	void disp(){
		System.out.println("Name :"+name);
		System.out.println("Division :"+div);
		System.out.println("Modulus :"+mod);
	}
}
class InterfaceTest4{
	public static void main(String args[]){ 
		student s=new student();
		s.name("Bidit");
		s.division(5);
		s.modulus(15);
		s.disp();
	}
}