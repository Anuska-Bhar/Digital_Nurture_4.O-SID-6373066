package factory;

public class ExcelDoc implements Document {
    @Override
    public void open() {
        System.out.println("Opening an Excel Document");
    }
}