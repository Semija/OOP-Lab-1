public class Palindrome {
	
	public static void main (String[] args) {

		if (args.length == 0) {
			System.out.println("There is no strings. Working on adding...");
			args = addStringValues();
		}
		
		for (int i = 0; i < args.length; i++) {
			String s = args[i];
			
			if (isPalindrome(s))
				System.out.println((i + 1) + " " + args[i] + " --> is palindrome");
			else 
				System.out.println((i + 1) + " " + args[i] + " --> is not palindrome");
		
		}
	}
	
	// Палиндром ли число
	public static boolean isPalindrome(String str) {
			return str.equals(reverseString(str));
	}
	
	// Переворот строки
	public static String reverseString(String str) {
		StringBuffer reStr = new StringBuffer();
		
		for (int i = str.length() - 1; i >= 0; i--) {
			reStr.append(str.charAt(i));
		}
		
		return new String(reStr);
	}

	// Создает набор строк
	public static String[] addStringValues() {
		String[] args = new String[5];
		args[0] = "Hello";
		args[1] = "World";
		args[2] = "mom";
		args[3] = "Something";
		args[4] = "2x2";
		
		return args;
	}
	
}