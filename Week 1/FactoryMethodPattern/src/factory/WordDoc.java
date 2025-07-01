package factory;

public class WordDoc implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Word Document");
    }
}