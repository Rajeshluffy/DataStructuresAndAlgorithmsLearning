package javaPractice;

public class StringLearning {

	public static void main(String[] args) {
		// 1. Length of a string
		String text = "Hello, Java!";
		System.out.println("Length: " + text.length());

		// 2. Convert to Uppercase
		String upperCaseText = text.toUpperCase();
		System.out.println("Uppercase: " + upperCaseText);

		// 3. Convert to Lowercase
		String lowerCaseText = text.toLowerCase();
		System.out.println("Lowercase: " + lowerCaseText);

		// 4. Extract a character at a specific index
		char characterAt = text.charAt(7);
		System.out.println("Character at index 7: " + characterAt);

		// 5. Check if string contains a substring
		boolean containsJava = text.contains("Java");
		System.out.println("Contains 'Java': " + containsJava);

		// 6. Replace a word in the string
		String replacedText = text.replace("Java", "World");
		System.out.println("Replaced Text: " + replacedText);

		// 7. Extract a substring
		String substringText = text.substring(7); // Extract from index 7 to end
		System.out.println("Substring from index 7: " + substringText);

		// 8. Trim spaces from beginning and end
		String textWithSpaces = "   Trim Me   ";
		System.out.println("Before Trim: '" + textWithSpaces + "'");
		System.out.println("After Trim: '" + textWithSpaces.trim() + "'");

		// 9. Split a string into an array
		String fruits = "Apple,Orange,Banana";
		String[] fruitArray = fruits.split(",");
		System.out.println("Split result:");
		for (String fruit : fruitArray) {
			System.out.println(fruit);
		}

		// 10. Check if a string starts with a specific prefix
		boolean startsWithHello = text.startsWith("Hello");
		System.out.println("Starts with 'Hello': " + startsWithHello);

		// 11. Check if a string ends with a specific suffix
		boolean endsWithJava = text.endsWith("Java!");
		System.out.println("Ends with 'Java!': " + endsWithJava);

		// 12. Compare strings using equals()
		String str1 = "Hello";
		String str2 = "hello";
		System.out.println("Equals (case-sensitive): " + str1.equals(str2)); // false
		System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2)); // true

		// 13. Check if string is empty
		String emptyStr = "";
		System.out.println("Is empty: " + emptyStr.isEmpty());

		// 14. Concatenation using concat()
		String greeting = "Hello";
		String name = "Alice";
		String fullGreeting = greeting.concat(", ").concat(name);
		System.out.println("Concatenated String: " + fullGreeting);

		// 15. Convert number to string
		int num = 100;
		String numStr = String.valueOf(num);
		System.out.println("Number to String: " + numStr);

		// 16. Find index of a character or substring
		int indexOfComma = text.indexOf(',');
		System.out.println("Index of ',' : " + indexOfComma);

		// 17. Last occurrence of a character
		int lastIndexOfA = text.lastIndexOf('a');
		System.out.println("Last index of 'a': " + lastIndexOfA);

		// 18. Check if string matches a regular expression
		String email = "test@example.com";
		boolean isValidEmail = email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
		System.out.println("Is valid email: " + isValidEmail);

		// 19. Repeat a string multiple times (Java 11+)
		String repeatStr = "Hi ".repeat(3);
		System.out.println("Repeated String: " + repeatStr);

		// 20. Join multiple strings using a delimiter
		String joinedStr = String.join(" - ", "Red", "Green", "Blue");
		System.out.println("Joined String: " + joinedStr);
	}
}


