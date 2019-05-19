package ch18.ex03;

public class CopyCounter {

	int calledTime = 0;

	public int increment() {
		return ++calledTime;
	}
}
