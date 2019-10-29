class gcd{
	static int answer(int a,int b){
		int ans=1;
		for (int i=1;i<a;i++){
			if(a%i==0 && b%i==0)
				ans=i;
		}
		System.out.println("GCD:"+ans);
		return 0;
	}
	public static void main(String[] args) {
		answer(56,98);
	}
}