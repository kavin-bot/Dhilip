package forday6;

public class Palindrome {
	public static void main (String [] args) {
		String a = "madam";
		String b ="";
		for(int i = a.length()-1 ; i>=0 ; i--) {
			  b=b+a.charAt(i);
		}
		if (a.equals(b)) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
		}
	}


