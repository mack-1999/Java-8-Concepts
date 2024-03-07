package String;

public class RepeatedWordsWithoutMap {
    public static void main(String[] args) {
        String inputString = "Hello world this is a simple Java program. Hello world again!";

        String[] words = inputString.split("\\s+");

        System.out.println("Repeated Words:");
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j])) {
                        System.out.println(words[i]);
                        words[j] = null; // Mark the repeated word to avoid printing it again
                    }
                }
            }
        }
    }
}
