import java.lang.Math;
class roots{
	static void answer(int a,int b,int c){
		double r1,r2;
		r1=(-b+(Math.sqrt((b*b)-4*a*c)))/(2*a);
		r2=(-b-(Math.sqrt((b*b)-4*a*c)))/(2*a);

		System.out.println("1st root is:"+r1);
		System.out.println("2nd root is:"+r2);
	}
	public static void main(String[] args) {
		answer(1,-5,6);
	}
}