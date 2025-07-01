package factory;

public class PdfDocFactory extends DocFactory {
    @Override
    public Document createDocument() {
        return new PdfDoc();
    }
}
