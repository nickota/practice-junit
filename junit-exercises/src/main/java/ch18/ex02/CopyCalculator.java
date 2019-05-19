package ch18.ex02;

public class CopyCalculator {

	
	public int divide(int n, int m) {
		if (m == 0) {
			throw new IllegalArgumentException("m is 0");
		}
		return n / m;
	}
}
