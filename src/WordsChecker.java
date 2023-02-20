import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private String txt;
    private Set<String> set;

    public WordsChecker(String txt) {
        this.txt = txt;
        set = new HashSet<>();
        set.addAll(List.of(txt.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String word) {
        if (set.contains(word)) {
            return true;
        }
        return false;
    }
}
