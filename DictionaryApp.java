import java.util.Scanner;

public class DictionaryApp {
    public static void main(String[] args) {
        Trie trie = new Trie();
        Scanner scanner = new Scanner(System.in);

        String[] words = {"srilakshmi", "java", "python", "polavarapu", "oops", "react"};
        for (String word : words) {
            trie.insert(word);
        }

        System.out.println("Dictionary Application using Trie");
        while (true) {
            System.out.println("\n1. Insert a word");
            System.out.println("2. Search for a word");
            System.out.println("3. Check prefix");
            System.out.println("4. Delete a word");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter a word to insert: ");
                    String wordToInsert = scanner.nextLine();
                    trie.insert(wordToInsert);
                    System.out.println("Word inserted successfully.");
                    break;
                case 2:
                    System.out.print("Enter a word to search: ");
                    String wordToSearch = scanner.nextLine();
                    if (trie.search(wordToSearch)) {
                        System.out.println("Word found in the dictionary.");
                    } else {
                        System.out.println("Word not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter a prefix to check: ");
                    String prefix = scanner.nextLine();
                    if (trie.startsWith(prefix)) {
                        System.out.println("There are words with this prefix in the dictionary.");
                    } else {
                        System.out.println("No words found with this prefix.");
                    }
                    break;
                case 4:
                    System.out.print("Enter a word to delete: ");
                    String wordToDelete = scanner.nextLine();
                    if (trie.delete(wordToDelete)) {
                        System.out.println("Word deleted successfully.");
                    } else {
                        System.out.println("Word not found or could not be deleted.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
