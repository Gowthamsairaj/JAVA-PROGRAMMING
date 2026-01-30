public class string_functions {
    public static void main(String[] args) {
        String s1 = "Java Programming";
        String s2 = "java programming";
        String s3 = "  Learn Java  ";
        System.out.println("Length: " + s1.length());
        System.out.println("Char at index 5: " + s1.charAt(5));
        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));
        System.out.println("CompareTo: " + s1.compareTo(s2));
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s1.toLowerCase());
        System.out.println("Substring (0,4): " + s1.substring(0, 7));
        System.out.println("Substring (5): " + s1.substring(5));
        System.out.println("Contains 'Java': " + s1.contains("Java"));
        System.out.println("Starts with Java: " + s1.startsWith("Java"));
        System.out.println("Ends with ing: " + s1.endsWith("ing"));
        System.out.println("Index of 'a': " + s1.indexOf('a'));
        System.out.println("Last index of 'a': " + s1.lastIndexOf('a'));
        System.out.println("Replace Java with Python: " + s1.replace("Java", "Python"));
        System.out.println("Remove spaces: " + s1.replaceAll("\\s", ""));
        System.out.println("Trimmed string:" + s3.trim() + "");
        String emptyStr = "";
        System.out.println("Is empty: " + emptyStr.isEmpty());
        String langs = "Java,Python,C++,JavaScript";
        String[] arr = langs.split(",");
        System.out.println("Split result:");
        for (String lang : arr) {
            System.out.println(lang);
        }
        System.out.println("Concat: " + "Hello".concat(" World"));
        int num = 10;
        String numStr = String.valueOf(num);
        System.out.println("ValueOf int: " + numStr);
        char[] chars = s1.toCharArray();
        System.out.println("Characters:");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println("\nRepeat: " + "Hi ".repeat(3));
    }
}