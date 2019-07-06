package WarmUps;

public class Fibonacci {
	public int fib(int num) {
		if (num == 1) {
			return 0;
		}
		if (num == 2) {
			return 1;
		}
		return fib(num - 2) + fib(num - 1);
	}
	
	public static void main(String[] args) {
		Fibonacci bob = new Fibonacci();
		System.out.println(bob.fib(50));
	}
}
