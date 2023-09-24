package AssignmentDay17;
import java.util.*;
public class BinarySearchDemo {
    public static void main(String[] args) {
        // Create a list of words
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("dog");
        words.add("elephant");
        // Sort the list of words
        Collections.sort(words);
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a word to search for
        System.out.println("Enter a word to search for: ");
        String wordToSearchFor = scanner.nextLine();
        // Perform binary search on the list of words
        int low = 0;
        int high = words.size() - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (words.get(mid).equals(wordToSearchFor)) {
                // The word was found
                System.out.println("The word " + wordToSearchFor + " was found at index " + mid);
                break;
            } else if (words.get(mid).compareTo(wordToSearchFor) < 0) {
                // The word is in the right half of the list
                low = mid + 1;
            } else {
                // The word is in the left half of the list
                high = mid - 1;
            }
        }
        if (low > high) {
            // The word was not found
            System.out.println("The word " + wordToSearchFor + " was not found");
        }
    }
}
