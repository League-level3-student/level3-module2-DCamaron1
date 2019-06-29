package WarmUps;

public class Recursion {
	public static void main(String[] args) {
		String something = "palindrome";
		System.out.println(reverseString(something));
	}
	
	public static String reverseString(String toReverse) {
		if (toReverse.length()==1) {
			return toReverse;
		}
		String first =  toReverse.substring(0,1);
		String last = toReverse.substring(1);
		return reverseString(last) + first;
	}
	
}
