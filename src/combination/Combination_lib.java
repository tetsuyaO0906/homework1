package combination;

public class Combination_lib{
	private int n;
	
	public Combination_lib(int n) {
		this.n = n;
	}
	
	public int getFactorial() { //�K��v�Z
		int f = 1;
		for(int i = 1; i <= this.n; i++) {
			f = i*f;
		}
		return  f;
	}
}
