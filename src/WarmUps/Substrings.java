package WarmUps;

public class Substrings {
	public static void main(String[] args) {
		printAllSubstrings("one two three four five ");
	}

	private static void printAllSubstrings(String string) {
		for (int i = 0; i < string.length(); i++) {
			for (int j = 0; j < string.length(); j++) {
				int endIndex = j + i + 1;
				if(endIndex<=string.length()) {
					System.out.println(string.substring(j, endIndex));
				}
			}
		}
	}
}
