package javaPractice;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder sb1 = new StringBuilder("Hello");
        System.out.println("Original String: " + sb1); // Output: Hello

        // Append operation (adds at the end)
        sb1.append(" World");
        System.out.println("After Append: " + sb1); // Output: Hello World

        // Insert operation (inserts at specified index)
        sb1.insert(5, " Java");
        System.out.println("After Insert: " + sb1); // Output: Hello Java World

        // Replace operation (replaces substring between given indexes)
        sb1.replace(6, 10, "Python");
        System.out.println("After Replace: " + sb1); // Output: Hello Python World

        // Delete operation (removes substring between given indexes)
        sb1.delete(6, 12);
        System.out.println("After Delete: " + sb1); // Output: Hello on World

        // Reverse operation (reverses the entire string)
        sb1.reverse();
        System.out.println("After Reverse: " + sb1); // Output: dlroW no olleH

        // Converting StringBuilder to String
        String finalString = sb1.toString();
        System.out.println("Converted to String: " + finalString); // Output remains the same

        // Get length of StringBuilder
        System.out.println("Length: " + sb1.length()); // Output: Length of reversed string

        // Get capacity of StringBuilder
        System.out.println("Capacity: " + sb1.capacity()); // Output: Current buffer capacity

        // Ensure minimum capacity
        sb1.ensureCapacity(50);
        System.out.println("New Capacity after ensureCapacity(50): " + sb1.capacity()); // Output: Updated capacity

        // Get character at a specific index
        System.out.println("Character at index 2: " + sb1.charAt(2)); // Output: Character at index 2

        // Set a character at a specific index
        sb1.setCharAt(2, 'Z');
        System.out.println("After setCharAt(2, 'Z'): " + sb1); // Output: Updated string with 'Z' at index 2

        // Get substring from StringBuilder
        System.out.println("Substring (2, 5): " + sb1.substring(2, 5)); // Output: Substring from index 2 to 5

        // Delete character at a specific index
        sb1.deleteCharAt(2);
        System.out.println("After deleteCharAt(2): " + sb1); // Output: String with character at index 2 removed

        // Find index of a substring
        System.out.println("Index of 'World': " + sb1.indexOf("World")); // Output: Index of "World" if exists, else -1

        // Find last index of a substring
        System.out.println("Last Index of 'o': " + sb1.lastIndexOf("o")); // Output: Last index of 'o' if exists, else -1

        // Trim the capacity of StringBuilder
        sb1.trimToSize();
        System.out.println("Capacity after trimToSize(): " + sb1.capacity()); // Output: Reduced capacity to match current size
    }
}
