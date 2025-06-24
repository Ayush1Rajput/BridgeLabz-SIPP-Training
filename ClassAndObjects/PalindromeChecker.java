public class PalindromeChecker {
    // Attribute
    String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanText = text.toLowerCase(); 
        int left = 0;
        int right = cleanText.length() - 1;

        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display result
    public void displayResult() {
        System.out.println("Text: \"" + text + "\"");
        if (isPalindrome()) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("Madam");
        PalindromeChecker checker2 = new PalindromeChecker("Hello");
        PalindromeChecker checker3 = new PalindromeChecker("A man, a plan, a canal, Panama");

        checker1.displayResult();
        System.out.println();
        checker2.displayResult();
        System.out.println();
        checker3.displayResult();
    }
}
