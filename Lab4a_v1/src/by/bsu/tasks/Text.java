package by.bsu.tasks;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Sentence> text;
    private List<Sentence> title;

    public Text() {
        text = new ArrayList<Sentence>();
        title = new ArrayList<Sentence>();
    }

    public List<Sentence> getText() {
        return text;
    }

    public List<Sentence> getTitle() {
        return title;
    }

    public void setText(List<Sentence> text) {
        this.text = text;
    }

    public void setTitle(List<Sentence> title) {
        this.title = title;
    }

    public void addTitle(Sentence title) {
        this.title.add(title);
    }

    public void addSent(Sentence sent) {
        this.text.add(sent);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        for (Sentence sentence : this.title) {
            sb.append(sentence);
        }
        sb.append("\n");
        for (Sentence sentence : this.text) {
            sb.append(sentence);
        }
        return sb.toString();
    }
}
