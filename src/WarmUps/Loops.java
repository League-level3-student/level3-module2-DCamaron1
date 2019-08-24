package WarmUps;

import java.util.ArrayList;

public class Loops {
	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<>(3);
		scores.add(7);
		scores.add(9);
		scores.add(-18);
		for (int i = 0; i < args.length; i++) {
			System.out.println(scores.get(i));
		}
		for(Integer number: scores) {
			System.out.println(number);
		}
	}
}
