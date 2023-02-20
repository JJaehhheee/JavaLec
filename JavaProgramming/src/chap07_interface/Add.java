package chap07_interface;

public class Add implements Calculator{
	public void calc(int t, int i) {
		System.out.println(t + i);
	}
}
