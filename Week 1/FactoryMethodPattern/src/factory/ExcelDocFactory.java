package factory;

public class ExcelDocFactory extends DocFactory {
    @Override
    public Document createDocument() {
        return new ExcelDoc();
    }
}