public class stringMethods {
    public static void main(String[] args) {
        // Metotları test etmek için örnek bir String
        String str = "Hello, World!";

        // length() metodu
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // toUpperCase() metodu
        String upperCaseStr = str.toUpperCase();
        System.out.println("Upper case: " + upperCaseStr);

        // toLowerCase() metodu
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lower case: " + lowerCaseStr);

        // equals() ve equalsIgnoreCase() metotları
        String str1 = "Hello";
        String str2 = "hello";
        boolean isEqual = str1.equals(str2);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("Equal: " + isEqual);
        System.out.println("Equal Ignore Case: " + isEqualIgnoreCase);

        // charAt() metodu
        char ch = str.charAt(2);
        System.out.println("Character at index 2: " + ch);

        // indexOf() ve lastIndexOf() metotları
        int index1 = str.indexOf('l');
        int index2 = str.lastIndexOf('l');
        System.out.println("Index of 'l': " + index1);
        System.out.println("Last index of 'l': " + index2);

        // substring() metodu
        String subStr = str.substring(7);
        String subStr2 = str.substring(0, 5);
        System.out.println("Substring 1: " + subStr);
        System.out.println("Substring 2: " + subStr2);
    }
}