package by.bsu.tasks;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> sentence;

    public Sentence() {
        sentence = new ArrayList<Word>();
    }

    public List<Word> getSentence() {
        return sentence;
    }

    public void setSentence(List<Word> sentence) {
        this.sentence = sentence;
    }

    public void addWord(Word new_word) {
        sentence.add(new_word);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        for (Word word : this.sentence) {
            sb.append(word);
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sentence sentence1 = (Sentence) o;

        return sentence != null ? sentence.equals(sentence1.sentence) : sentence1.sentence == null;
    }

    @Override
    public int hashCode() {
        return sentence != null ? sentence.hashCode() : 0;
    }
}
