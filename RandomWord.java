import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String[] strings = StdIn.readAllStrings();
        String word, chosenWord;
        chosenWord = StdIn.readString();

        while (!StdIn.isEmpty()) {
            word = StdIn.readString();
            if (StdRandom.bernoulli(strings.length)) {
                chosenWord = word;
            }
        }
        StdOut.print(chosenWord);
    }
}
