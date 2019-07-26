package lib;

public class AddCalc {
	Calculator calc;
	public Calculator getCalc() {
		return calc;
	}
	public void setCalc(Calculator calc) {
		this.calc = calc;
	}
	public int addVal (int x, int y) {
		return x+y;
	}
}
