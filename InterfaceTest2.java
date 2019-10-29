interface A{
	public void meth1();
	public void meth2();
}
class MyClass implements A{
	public void meth1(){
		System.out.println("In Method 1");
	}
	public void meth2(){
		System.out.println("In Method 2");
	}
}
class InterfaceTest2{
	public static void main(String[] args) {
		A obj = new MyClass();
		obj.meth1();
		obj.meth2();
	}
}