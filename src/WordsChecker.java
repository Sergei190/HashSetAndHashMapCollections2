import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private String txt;

    public WordsChecker(String txt) {
        this.txt = txt;
    }

    public boolean hasWord(String word) {
        Set<String> set = new HashSet<>();
        set.addAll(List.of(txt.split("\\P{IsAlphabetic}+")));

        if (set.contains(word)) {
            return true;
        }
        return false;
    }
}
