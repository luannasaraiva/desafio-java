/*
 * Modela um par.
 */
public class Pares {
	

	protected int a;
	protected int b;
	
	Pares(int a, int b){
		this.a = a;
		this.b = b;		
	}
	
	public String toString() {
		return "["+a+","+b+"]";
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	

}
