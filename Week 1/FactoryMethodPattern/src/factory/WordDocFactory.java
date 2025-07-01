package factory;

public class WordDocFactory extends DocFactory {
    @Override
    public Document createDocument() {
        return new WordDoc();
    }
}
