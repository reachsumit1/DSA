package AssignmentDay17;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        // Create a list of words
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("dog");
        words.add("elephant");
        // Sort the list of words using insertion sort
        insertionSort(words);
        // Print the sorted list of words
        for (String word : words) {
            System.out.println(word);
        }
    }
    public static void insertionSort(List<String> words) {
        for (int i = 1; i < words.size(); i++) {
            String key = words.get(i);
            int j = i - 1;
            while (j >= 0 && words.get(j).compareTo(key) > 0) {
                words.set(j + 1, words.get(j));
                j--;
            }
            words.set(j + 1, key);
        }
    }
}