package by.bsu.tasks;

public class Main {

    public static void main(String[] args) {
        Sentence sentence = new Sentence();
        sentence.addWord(new Word("Создали объект класса Текст, "));
        sentence.addWord(new Word("используя "));
        sentence.addWord(new Word("классы "));
        sentence.addWord(new Word("Предложение, "));
        sentence.addWord(new Word("Слово."));

        Sentence title = new Sentence();
        title.addWord(new Word("Заголовок текста"));

        Text myText = new Text();
        myText.addTitle(title);
        myText.addSent(sentence);

        System.out.println(myText);
    }
}
